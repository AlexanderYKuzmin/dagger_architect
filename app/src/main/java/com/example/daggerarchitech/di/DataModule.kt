package com.example.daggerarchitech.di

import android.content.Context
import com.example.daggerarchitech.data.datasource.*
import dagger.Binds
import dagger.Module
import dagger.Provides


@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindExampleLocalDataSource(exampleLocalDataSourceImpl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @ProdQualifier
    @ApplicationScope
    @Binds
    fun bindExampleRemoteDataSource(exampleRemoteDataSourceImpl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

    @TestQualifier
    @ApplicationScope
    @Binds
    fun bindTestRemoteDataSource(testRemoteDataSourceImpl: TestRemoteDataSourceImpl): ExampleRemoteDataSource
}

/*
@Module
class DataModule(private val context: Context) {

    @Provides
    fun provideContext(): Context {
        return context
    }

    @Provides
    fun provideExampleLocalDataSource(exampleLocalDataSourceImpl: ExampleLocalDataSourceImpl): ExampleLocalDataSource {
        return exampleLocalDataSourceImpl
    }

    @Provides
    fun provideExampleRemoteDataSource(exampleRemoteDataSourceImpl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource {
        return exampleRemoteDataSourceImpl
    }
}*/
