package com.example.daggerarchitech.di

import android.content.Context
import com.example.daggerarchitech.data.datasource.ExampleLocalDataSource
import com.example.daggerarchitech.data.datasource.ExampleLocalDataSourceImpl
import com.example.daggerarchitech.data.datasource.ExampleRemoteDataSource
import com.example.daggerarchitech.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.Provides


@Module
interface DataModule {

    @Binds
    fun bindExampleLocalDataSource(exampleLocalDataSourceImpl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @Binds
    fun bindExampleRemoteDataSource(exampleRemoteDataSourceImpl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource
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
