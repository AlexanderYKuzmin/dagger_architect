package com.example.daggerarchitech.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.daggerarchitech.di.IdQualifier
import com.example.daggerarchitech.di.NameQualifier
import com.example.daggerarchitech.domain.ExampleUseCase
import javax.inject.Inject
import javax.inject.Named

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase,
    @IdQualifier private val id: String,
    @NameQualifier private val name: String
) : ViewModel() {

    fun method() {
        useCase()
        Log.d("ExampleViewModel", "$this $id $name")
    }
}