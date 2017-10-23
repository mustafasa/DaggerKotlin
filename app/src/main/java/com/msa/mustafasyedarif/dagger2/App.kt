package com.msa.mustafasyedarif.dagger2

import android.app.Application
import com.msa.mustafasyedarif.dagger2.di.AppComponent
import com.msa.mustafasyedarif.dagger2.di.AppModule
import com.msa.mustafasyedarif.dagger2.di.DaggerAppComponent

/**
 * Created by arifm2 on 10/19/2017.
 */
class App : Application() {
     var appComponent:AppComponent?= null

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule()).build()
        }

     fun getActivityComponent(): AppComponent? {
        return appComponent
    }
}