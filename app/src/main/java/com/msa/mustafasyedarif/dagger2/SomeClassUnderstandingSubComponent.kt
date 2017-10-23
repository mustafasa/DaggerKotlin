package com.msa.mustafasyedarif.dagger2

import javax.inject.Inject

/**
 * Created by arifm2 on 10/23/2017.
 */
class SomeClassUnderstandingSubComponent @Inject
constructor() :SomeClassUnderstandingSubComponentInterface {
    override fun welcome(): String {
       return "subcomponentclass"
    }

}