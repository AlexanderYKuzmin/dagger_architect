package com.example.daggerarchitech.data.database

import android.content.Context
import android.util.Log
import com.example.daggerarchitech.R
import javax.inject.Inject

class ExampleDatabase @Inject constructor(
    private val context: Context
    ) {
    fun method() {
        Log.d(LOG_TAG, "ExampleDatabase + ${context.getString(R.string.app_name)}")
    }

    companion object {
        private val LOG_TAG = "ExampleDatabase"
    }
}