package com.bca.muciter.presenter.bcaofficer.homebca


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.bca.muciter.R
import com.bca.muciter.base.BaseFragment
import com.bca.muciter.presenter.bcaofficer.WelcomeActivity
import kotlinx.android.synthetic.main.fragment_home_bca.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.support.v4.ctx

/**
 * A simple [Fragment] subclass.
 *
 */
class HomeBCAFragment : BaseFragment() {

    companion object Factory{
        fun getInstance(): HomeBCAFragment {
            return HomeBCAFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_bca, container, false)
    }

    override fun setup() {
        initializeView()
    }

    private fun initializeView(){
        startLinearLayout.setOnClickListener {
            ctx.startActivity<WelcomeActivity>()
        }
    }
}
