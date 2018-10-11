package com.bca.muciter.presenter.bcaofficer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bca.muciter.R
import com.bca.muciter.base.BaseActivity
import com.bca.muciter.presenter.bcaofficer.motor.MotorFragment

class HomeCustomerActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_customer)

        setup(savedInstanceState)
    }

    override fun setup(savedInstanceState: Bundle?) {
        val transaction = supportFragmentManager.beginTransaction()
        val fragment = MotorFragment.getInstance()
        transaction.replace(R.id.main_container, fragment).commit()
    }
}
