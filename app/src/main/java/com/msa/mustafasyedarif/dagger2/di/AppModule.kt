package com.msa.mustafasyedarif.dagger2.di

import com.msa.mustafasyedarif.dagger2.SomeClass
import com.msa.mustafasyedarif.dagger2.SomeClassImpl
import dagger.Module
import dagger.Provides

/**
 * Created by arifm2 on 10/19/2017.
 */

@Module
class AppModule{
    @Provides
    internal fun gettt(
            simulatedBackendController: SomeClassImpl): SomeClass {
        return simulatedBackendController
    }
}
