package com.example.victor.mircoriza.application

import android.content.Context

open class BasePresenter<T:BaseView> {

    private var context : Context? = null
    private var view: T? = null

    protected constructor(v: T?) {

        context = view as Context
        view = v

    }

    protected constructor(v: T, ctx: Context) {

        context = ctx
        view = v

    }

}