package com.example.daggerarchitech.data.database

import android.content.Context
import android.util.Log
import com.example.daggerarchitech.R
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ExampleDatabase @Inject constructor(
    private val context: Context,
    private var time: Long
    ) {
    fun method() {
        Log.d(LOG_TAG, "ExampleDatabase_1" + " ${context.getString(R.string.app_name)} time: ${time}")
        Thread.sleep(10)
        Log.d(LOG_TAG, "ExampleDatabase_2" + " ${context.getString(R.string.app_name)} time: ${time}")
    }

    companion object {
        private val LOG_TAG = "ExampleDatabase"
    }
}