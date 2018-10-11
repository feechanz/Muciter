package com.bca.muciter.presenter.bcaofficer

import android.os.Bundle
import android.support.v4.app.Fragment
import com.bca.muciter.R
import com.bca.muciter.adapter.MotorDetailPagerAdapter
import com.bca.muciter.base.BaseActivity
import com.bca.muciter.model.Motor
import com.bca.muciter.presenter.bcaofficer.motor.detail.MotorDescriptionFragment
import com.bca.muciter.presenter.bcaofficer.motor.detail.MotorSpecificationFragment
import com.bca.muciter.utils.toDecimalString
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_motor_detail.*

class MotorDetailActivity : BaseActivity() {

    private lateinit var motor: Motor
    private lateinit var pagerAdapter: MotorDetailPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motor_detail)

        val intent = intent
        motor = intent.getParcelableExtra("motor")
        setup(savedInstanceState)
    }

    override fun setup(savedInstanceState: Bundle?) {
        motorNameTextView.text = motor.motorName
        brandTextView.text = motor.motorBrand
        motorPriceTextView.text = "Rp. " + toDecimalString(motor.motorPrice)

        Picasso.get().load(motor.motorThumbnail).into(motorImageView)
        setupPager()
    }

    private fun setupPager(){
        pagerAdapter = MotorDetailPagerAdapter(supportFragmentManager)

        val descriptionBundle = Bundle()
        descriptionBundle.putString("description", motor.motorDescription)
        val fragmentDescription = MotorDescriptionFragment.getInstance()
        fragmentDescription.arguments = descriptionBundle

        val specificationBundle = Bundle()
        specificationBundle.putParcelable("motor", motor)
        val fragmentSpescification = MotorSpecificationFragment.getInstance()


        pagerAdapter.addFragment(fragmentDescription)
        pagerAdapter.addFragment(fragmentSpescification)

        pager.adapter = pagerAdapter
        headerTabLayout.setupWithViewPager(pager)
    }
}
