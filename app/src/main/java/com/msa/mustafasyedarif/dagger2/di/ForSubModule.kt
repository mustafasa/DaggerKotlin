package com.msa.mustafasyedarif.dagger2.di

import com.msa.mustafasyedarif.dagger2.SomeClassUnderstandingSubComponent
import com.msa.mustafasyedarif.dagger2.SomeClassUnderstandingSubComponentInterface
import dagger.Module
import dagger.Provides

/**
 * Created by arifm2 on 10/23/2017.
 */
@Module
class ForSubModule {
    @Provides
    internal fun getIt(someClassUnderstandingSubComponent:
                       SomeClassUnderstandingSubComponent):
            SomeClassUnderstandingSubComponentInterface {
        return someClassUnderstandingSubComponent;
    }
}