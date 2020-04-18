package com.coderzl.configedroutersample

import android.app.Application
import com.coderzl.configedrouter.RouterHelper
import com.coderzl.configedrouter.SimpleSchemeValidator

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        RouterHelper.initialize(SimpleSchemeValidator(assets.open(""), arrayOf("")))
    }
}