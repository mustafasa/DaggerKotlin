package com.msa.mustafasyedarif.dagger2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.msa.mustafasyedarif.dagger2.di.ForSubModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var someClassUnderstandingDirectInject: SomeClassUnderstandingDirectInject
    @Inject
    lateinit var someclass: SomeClass



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (application as App).getActivityComponent()?.inject(this)
        (application as App).getActivityComponent()?.getItBuddy(ForSubModule())
        Log.d("h", someClassUnderstandingDirectInject!!.get());
        Log.d("h",someclass!!.welcome());
       startActivity(Intent(this,Main2Activity::class.java));
    }
}
