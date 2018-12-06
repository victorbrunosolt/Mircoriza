package com.example.victor.mircoriza.application

import android.content.pm.ActivityInfo
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.example.victor.mircoriza.R

abstract class BaseActivity: AppCompatActivity(), BaseView{

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        this.setThemeApp(R.style.Theme_AppCompat_Light_NoActionBar)
        super.onCreate(savedInstanceState, persistentState)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
    }

    private fun setThemeApp(layout: Int) {
        setTheme(layout)
    }

    override fun closeApp() {
        finish()
        System.exit(0)
    }

}