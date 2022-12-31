package com.example.daggerarchitech.domain

import javax.inject.Inject

class ExampleUseCase @Inject constructor(
    private val repository: ExampleRepository
) {
    operator fun invoke() {
        repository.method()
    }
}