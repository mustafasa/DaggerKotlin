package com.msa.mustafasyedarif.dagger2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.msa.mustafasyedarif.dagger2.di.ForSubModule
import javax.inject.Inject

class Main2Activity : AppCompatActivity() {
    @Inject
    lateinit var someClassUnderstandingSubComponentInterface: SomeClassUnderstandingSubComponentInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        (application as App).getActivityComponent()?.getItBuddy(ForSubModule())?.inject(this)
        Log.d("sub : ",someClassUnderstandingSubComponentInterface!!.welcome());
    }
}
