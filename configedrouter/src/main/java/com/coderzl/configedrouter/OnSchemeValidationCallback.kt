package com.coderzl.configedrouter

/**
 * A callback for client to receive the checked result.
 * @author zhanglei
 * @since 1.0
 */
interface OnSchemeValidationCallback {
    /**
     * Called if checked failed.
     * @param errors is the parameter errors by validation.
     */
    fun onException(errors: String)
}