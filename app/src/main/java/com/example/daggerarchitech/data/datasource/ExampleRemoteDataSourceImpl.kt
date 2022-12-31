package com.example.daggerarchitech.data.datasource

import com.example.daggerarchitech.data.network.ExampleApiService
import javax.inject.Inject

class ExampleRemoteDataSourceImpl @Inject constructor(
    private val apiService: ExampleApiService
) : ExampleRemoteDataSource {
    override fun method() {
        apiService.method()
    }
}