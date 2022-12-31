package com.example.daggerarchitech.di

import com.example.daggerarchitech.data.repository.ExampleRepositoryImpl
import com.example.daggerarchitech.domain.ExampleRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DomainModule {

    @Binds
    fun bindExampleRepository(exampleRepositoryImpl: ExampleRepositoryImpl): ExampleRepository
}

/*
@Module
class DomainModule {
    @Provides
    fun provideExampleRepository(exampleRepositoryImpl: ExampleRepositoryImpl) : ExampleRepository {
        return exampleRepositoryImpl
    }

}*/
