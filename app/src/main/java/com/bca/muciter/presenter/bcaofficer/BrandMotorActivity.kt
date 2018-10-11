package com.bca.muciter.presenter.bcaofficer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bca.muciter.R
import kotlinx.android.synthetic.main.activity_brand_motor.*
import org.jetbrains.anko.ctx
import org.jetbrains.anko.startActivity

class BrandMotorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_brand_motor)

        val name = intent.getStringExtra("name")
        hiTextView.text = "Hi, "+name

        allBrandButton.setOnClickListener {
            ctx.startActivity<HomeCustomerActivity>()
        }
    }
}
