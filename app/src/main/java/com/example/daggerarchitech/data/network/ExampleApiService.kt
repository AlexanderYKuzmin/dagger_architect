package com.example.daggerarchitech.data.network

import android.util.Log
import com.example.daggerarchitech.di.ApplicationScope
import javax.inject.Inject
import javax.inject.Singleton

@ApplicationScope
class ExampleApiService @Inject constructor(
    private var time: Long
){
    fun method() {
        Log.d(LOG_TAG, "ExampleApiService" + " time: ${time}")
    }

    companion object {
        private val LOG_TAG = "ExampleApiService"
    }
}