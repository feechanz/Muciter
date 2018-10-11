package com.bca.muciter.presenter.bcaofficer

import android.os.Bundle
import com.bca.muciter.R
import com.bca.muciter.base.BaseActivity
import com.bca.muciter.presenter.bcaofficer.motor.MotorFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setup(savedInstanceState)
    }

    override fun setup(savedInstanceState: Bundle?) {
        bottom_navigation.setOnNavigationItemSelectedListener {item ->
            when(item.itemId){
                R.id.homeMenu ->{
                    loadMotorFragment(savedInstanceState)
                }
                R.id.orderMenu ->{
                }
            }
            invalidateOptionsMenu()
            true
        }
        bottom_navigation.selectedItemId = R.id.homeMenu
    }

    private fun loadMotorFragment(savedInstanceState: Bundle?){
        if (savedInstanceState == null) {
            supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.main_container, MotorFragment(), MotorFragment::class.java.simpleName)
                    .commit()
        }
    }
}
