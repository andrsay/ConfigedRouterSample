package com.coderzl.configedrouter

/**
 * A simple implements for [SchemeCheckable] to check the scheme, just check the parameters.
 * @author zhanglei
 * @since 1.0
 */
class SchemeRuler {

    /**
     * Equivalent to the path of [Scheme].
     */
    var path: String? = null
    /**
     * K is the parameter name and V is the ruler for the parameter, generally the ruler is a regex.
     */
    var paramRulerMap: Map<String, String>? = null
}