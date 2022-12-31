package com.example.daggerarchitech.data.network

import android.util.Log
import javax.inject.Inject

class ExampleApiService @Inject constructor(){
    fun method() {
        Log.d(LOG_TAG, "ExampleApiService")
    }

    companion object {
        private val LOG_TAG = "ExampleApiService"
    }
}