package com.example.daggerarchitech.di

import com.example.daggerarchitech.presentation.MainActivity
import dagger.BindsInstance
import dagger.Subcomponent
import javax.inject.Named

@Subcomponent(modules = [ViewModelModule::class])
interface ActivityComponent {

    fun inject(activity: MainActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create(
            @BindsInstance @IdQualifier id: String,  //Заменили @Named("id") создали кастомную аннотацию
            @BindsInstance @NameQualifier name: String
        ): ActivityComponent
    }
}