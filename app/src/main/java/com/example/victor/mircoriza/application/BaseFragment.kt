package com.example.victor.mircoriza.application

import android.support.v4.app.Fragment

class BaseFragment: Fragment(),BaseView {


    override fun closeApp() {
        (activity as BaseActivity).closeApp()
    }
}