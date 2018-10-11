package com.bca.muciter.base

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.ActionBar
import android.support.v7.app.AppCompatActivity
import com.bca.muciter.R

abstract class BaseActivity : AppCompatActivity(){
    abstract fun setup(savedInstanceState: Bundle?)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val actionBar = getActionBar()
        title = ""
    }
}