package com.coderzl.configedroutersample

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.coderzl.configedrouter.OnSchemeValidationCallback
import com.coderzl.configedrouter.RouterHelper
import com.coderzl.configedrouter.SchemeValidator
import com.coderzl.configedrouter.SimpleSchemeValidator

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helper = RouterHelper.Builder(this)
            .build()
        helper.navigate(Uri.parse(""), object : OnSchemeValidationCallback {
            override fun onException(errors: String) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })
    }
}
