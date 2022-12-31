package com.example.daggerarchitech.data.network

import android.util.Log
import javax.inject.Inject

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