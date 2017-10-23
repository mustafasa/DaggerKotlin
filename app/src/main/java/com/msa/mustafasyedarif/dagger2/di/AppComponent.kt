package com.msa.mustafasyedarif.dagger2.di

import com.msa.mustafasyedarif.dagger2.MainActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by arifm2 on 10/19/2017.
 */

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun inject(activity: MainActivity)
    fun getItBuddy(forSubModule: ForSubModule):ForSubComponent
}
