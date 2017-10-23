package com.msa.mustafasyedarif.dagger2.di

import com.msa.mustafasyedarif.dagger2.Main2Activity
import dagger.Subcomponent

/**
 * Created by arifm2 on 10/23/2017.
 */

@Subcomponent(modules  = arrayOf(ForSubModule::class))
interface ForSubComponent {
    fun inject(activity: Main2Activity)
}