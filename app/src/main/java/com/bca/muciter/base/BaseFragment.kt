package com.bca.muciter.base

import android.os.Bundle
import android.support.v4.app.Fragment

abstract class BaseFragment: Fragment(){
    abstract fun setup()

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setup()
    }
}