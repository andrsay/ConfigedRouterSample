package com.coderzl.configedrouter

/**
 * The scheme data including the the path for router and its parameters.
 * @author zhanglei
 * @since 1.0
 */
data class Scheme(var path: String, var parameters: Map<String, Any>) {
}