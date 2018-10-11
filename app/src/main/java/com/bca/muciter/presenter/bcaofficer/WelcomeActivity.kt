package com.bca.muciter.presenter.bcaofficer

import android.os.Bundle
import com.bca.muciter.R
import com.bca.muciter.base.BaseActivity
import kotlinx.android.synthetic.main.activity_welcome.*
import org.jetbrains.anko.ctx
import org.jetbrains.anko.startActivity

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        setup(savedInstanceState)
    }

    override fun setup(savedInstanceState: Bundle?) {
        nextButton.setOnClickListener {
            ctx.startActivity<BrandMotorActivity>("name" to nameEditText.text.toString())
        }
    }
}
