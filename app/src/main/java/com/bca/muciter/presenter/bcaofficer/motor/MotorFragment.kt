package com.bca.muciter.presenter.bcaofficer.motor


import android.os.Bundle
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.GridLayoutManager
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.bca.muciter.R
import com.bca.muciter.adapter.MotorAdapter
import com.bca.muciter.base.BaseFragment
import com.bca.muciter.model.Motor
import com.bca.muciter.presenter.bcaofficer.MotorDetailActivity
import kotlinx.android.synthetic.main.fragment_motor.*
import org.jetbrains.anko.design.snackbar
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.support.v4.ctx
import org.jetbrains.anko.support.v4.onRefresh


class MotorFragment : BaseFragment(), MotorContract.View {
    private lateinit var presenter: MotorContract.Presenter
    private lateinit var adapter: MotorAdapter
    private var motors: MutableList<Motor> = mutableListOf()
    private var motorsFilter: MutableList<Motor> = mutableListOf()
    private var brand: String = "all"

    companion object Factory{
        fun getInstance(): MotorFragment {
            return MotorFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_motor, container, false)
    }

    override fun setup() {
        initPresenter()
        initBaseView()
    }

    override fun initBaseView(){
        adapter = MotorAdapter(motorsFilter){ motor ->
            //on card motor clicked
            ctx.startActivity<MotorDetailActivity>("motor" to motor)
        }
        val layoutManager = GridLayoutManager(context, 2)

        dataRecyclerView.layoutManager = layoutManager
        dataRecyclerView.itemAnimator = DefaultItemAnimator()
        dataRecyclerView.adapter = adapter

        presenter.loadData(brand)

        searchEditText.clearFocus()
        searchEditText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(s: CharSequence?, p1: Int, p2: Int, p3: Int) {
                presenter.loadFilteredData(s.toString(),motors)
            }
        })
        dataSwipeRefreshLayout.onRefresh {
            presenter.loadData(brand)
        }
    }

    override fun initPresenter() {
        presenter = MotorPresenter(this)
    }

    override fun loadData(data: List<Motor>){
        dataSwipeRefreshLayout.isRefreshing = false
        motors.clear()
        motors.addAll(data)

        presenter.loadFilteredData(searchEditText.text.toString(), motors)
    }

    override fun loadFilteredData(data: List<Motor>) {
        motorsFilter.clear()
        motorsFilter.addAll(data)
        adapter.notifyDataSetChanged()
    }

    override fun showSnackbar(text: String) {
        snackbar(dataSwipeRefreshLayout, text).show()
    }
}
