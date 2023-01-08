package com.example.daggerarchitech.data.repository

import com.example.daggerarchitech.data.datasource.ExampleLocalDataSource
import com.example.daggerarchitech.data.datasource.ExampleRemoteDataSource
import com.example.daggerarchitech.di.TestQualifier
import com.example.daggerarchitech.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor(
    private val localDataSource: ExampleLocalDataSource,
    @TestQualifier private val remoteDataSource: ExampleRemoteDataSource
) : ExampleRepository {
    override fun method() {
        localDataSource.method()
        remoteDataSource.method()
    }
}