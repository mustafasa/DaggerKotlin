package com.msa.mustafasyedarif.dagger2

import javax.inject.Inject

/**
 * Created by arifm2 on 5/4/2017.
 */

class SomeClassUnderstandingDirectInject @Inject
constructor() {
    private var word: String? = null

    init {
        word = "Mustafa"
    }


    internal fun get(): String? {
        return word
    }
}
