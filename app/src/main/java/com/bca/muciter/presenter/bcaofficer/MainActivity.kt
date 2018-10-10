package com.bca.muciter.presenter.bcaofficer

import android.os.Bundle
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.GridLayoutManager
import android.text.Editable
import android.text.TextWatcher
import com.bca.muciter.R
import com.bca.muciter.adapter.MotorAdapter
import com.bca.muciter.base.BaseActivity
import com.bca.muciter.model.Motor
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.design.snackbar
import org.jetbrains.anko.sdk25.coroutines.textChangedListener
import org.jetbrains.anko.support.v4.onRefresh

class MainActivity : BaseActivity(), MainContract.View {
    private lateinit var presenter: MainContract.Presenter
    private lateinit var adapter: MotorAdapter
    private var motors: MutableList<Motor> = mutableListOf()
    private var motorsFilter: MutableList<Motor> = mutableListOf()
    private var brand: String = "all"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setup()
    }

    override fun setup() {
        initPresenter()
        initBaseView()
    }

    override fun initBaseView(){
        adapter = MotorAdapter(motorsFilter){ motor ->
            //on card motor clicked
            TODO("open detail motor from Card")
        }
        val layoutManager = GridLayoutManager(this, 2)

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
        presenter = MainPresenter(this)
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
