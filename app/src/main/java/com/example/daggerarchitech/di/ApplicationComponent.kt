package com.example.daggerarchitech.di

import android.content.Context
import com.example.daggerarchitech.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {
    fun inject(activity: MainActivity)

    @Component.Builder
    interface ApplicationComponentBuilder {

        @BindsInstance
        fun context(context: Context): ApplicationComponentBuilder

        @BindsInstance
        fun currentTime(time: Long): ApplicationComponentBuilder

        fun build(): ApplicationComponent
    }
}