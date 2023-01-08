package com.example.daggerarchitech.di

import android.content.Context
import com.example.daggerarchitech.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {



    fun activityComponentFactory(): ActivityComponent.Factory

    /*@Component.Builder
    interface ApplicationComponentBuilder {

       *//* @BindsInstance
        fun context(context: Context): ApplicationComponentBuilder

        @BindsInstance
        fun currentTime(time: Long): ApplicationComponentBuilder

        fun build(): ApplicationComponent*//*


    }*/

    @Component.Factory
    interface ApplicationComponentFactory {
        fun create(
            @BindsInstance context: Context,
            @BindsInstance timeMillis: Long
        ): ApplicationComponent
    }
}