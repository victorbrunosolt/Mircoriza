package com.example.victor.mircoriza.login.activity

import android.databinding.DataBindingUtil
import android.os.Bundle
import com.example.victor.mircoriza.R

import com.example.victor.mircoriza.application.BaseActivity
import com.example.victor.mircoriza.databinding.ActivityLoginBinding

class LoginActivity:BaseActivity() {

    lateinit var dataBiding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBiding = DataBindingUtil.setContentView(this, R.layout.activity_login)
    }
}