package com.coderzl.configedrouter

import java.io.InputStream

class SimpleSchemeValidator(private var inputStream: InputStream, separators: Array<String>): SchemeValidator(inputStream) {

    override fun parseSingleRule(ruleLineText: String): SchemeRuler? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}