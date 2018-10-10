package com.bca.muciter.presenter

import android.os.Bundle
import com.bca.muciter.R
import com.bca.muciter.base.BaseActivity
import com.bca.muciter.presenter.bcaofficer.MainActivity
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.ctx
import org.jetbrains.anko.startActivity

class LoginActivity : BaseActivity() {
    override fun setup() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        initBaseView()
    }

    private fun initBaseView(){
        loginButton.setOnClickListener {
            ctx.startActivity<MainActivity>()
        }
    }
}
