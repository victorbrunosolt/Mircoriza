package com.example.victor.mircoriza.utils

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.example.victor.mircoriza.R
import com.example.victor.mircoriza.application.BaseActivity
import com.example.victor.mircoriza.login.activity.LoginActivity


open class SplashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_creen)

        val handle = Handler()
        handle.postDelayed({ init() }, 2000)
    }

    private fun init() {

        intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()

    }
}
