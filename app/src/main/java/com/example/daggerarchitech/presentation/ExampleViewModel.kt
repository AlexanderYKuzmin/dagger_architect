package com.example.daggerarchitech.presentation

import com.example.daggerarchitech.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase
) {
    fun method() {
        useCase()
    }
}