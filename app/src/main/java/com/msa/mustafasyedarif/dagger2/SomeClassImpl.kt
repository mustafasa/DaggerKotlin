package com.msa.mustafasyedarif.dagger2

import javax.inject.Inject

/**
 * Created by arifm2 on 10/19/2017.
 */

class SomeClassImpl @Inject
constructor() : SomeClass {
    override fun welcome(): String {
        return "someclass"
    }
}

