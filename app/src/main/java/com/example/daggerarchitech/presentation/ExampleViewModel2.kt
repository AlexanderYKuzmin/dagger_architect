package com.example.daggerarchitech.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.daggerarchitech.domain.ExampleRepository
import com.example.daggerarchitech.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel2 @Inject constructor(
    private val repository: ExampleRepository
) : ViewModel() {

    fun method() {
        Log.d("ExampleViewModel2", "$this")
    }
}