package com.bca.muciter.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity(){
    abstract fun setup(savedInstanceState: Bundle?)
}