package com.bca.muciter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bca.muciter.presenter.LoginActivity
import org.jetbrains.anko.ctx
import org.jetbrains.anko.startActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ctx.startActivity<LoginActivity>()
        finish()
    }
}