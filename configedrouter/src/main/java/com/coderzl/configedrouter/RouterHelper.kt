package com.coderzl.configedrouter

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import androidx.annotation.NonNull
import java.io.InputStream

/**
 * A helper class for client to navigate to another router by configuration.
 * @author zhanglei
 * @since 1.0
 * @param needEntireErrors expresses whether the caller need to check all of parameters.
 */
class RouterHelper constructor(private var needEntireErrors: Boolean) {

    private lateinit var context: Context
    companion object {

        private lateinit var sValidator: SchemeValidator

        fun initialize(@NonNull validator: SchemeValidator) {
            sValidator = validator
        }
    }

    /**
     * Builder class.
     */
    class Builder(private var context: Context) {
        private var needEntireErrors: Boolean = false

        fun setNeedEntireErrors(needEntireErrors: Boolean){
            this.needEntireErrors = needEntireErrors
        }

        fun build(): RouterHelper {
            return RouterHelper(needEntireErrors)
        }
    }

    /**
     * Navigate to another component by uri.
     * @param uri from caller's request.
     * @param callback is the callback for receive errors.
     */
    fun navigate(@NonNull uri: Uri, callback: OnSchemeValidationCallback) {
        val scheme = generateSchemeFromUri(uri)
        val errors = sValidator.check(scheme, needEntireErrors)
        if(errors == null){
            realNavigate(scheme)
        }else {
            callback.onException(errors)
        }
    }

    /**
     * Create a scheme object with host and parameters by parsing the uri.
     */
    private fun generateSchemeFromUri(uri: Uri): Scheme {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    /**
     * Checked passed! Just start a component by scheme.
     */
    private fun realNavigate(scheme: Scheme) {

    }
}