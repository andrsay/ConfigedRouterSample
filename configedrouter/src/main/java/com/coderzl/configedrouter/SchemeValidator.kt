package com.coderzl.configedrouter

import org.jetbrains.annotations.NotNull
import java.io.InputStream

/**
 * TODO add javadoc.
 * @author zhanglei
 * @since 1.0
 */
abstract class SchemeValidator(private var input: InputStream){

    companion object {
        private var sSchemeRulerMap: Map<String, SchemeRuler>? = null
    }

    init {
        loadRulers(input)
    }

    private fun loadRulers(input: InputStream) {

    }

    /**
     * Check the scheme and return result.
     * @param scheme is the scheme to be checked.
     * @param needEntireErrors means whether return entire errors.If the values is true, it will check
     * all of parameters and return, otherwise, return one error if the first error occurs.
     * @return null if no errors, otherwise return checked errors.
     */
    fun check(@NotNull scheme: Scheme, needEntireErrors: Boolean): String? {

        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    protected abstract fun parseSingleRule(ruleLineText: String): SchemeRuler?
}