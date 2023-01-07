package com.example.daggerarchitech.di

import androidx.lifecycle.ViewModel
import com.example.daggerarchitech.presentation.ExampleViewModel
import com.example.daggerarchitech.presentation.ExampleViewModel2
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
interface ViewModelModule {

    @IntoMap
    //@StringKey("ExampleViewModel") //лучше заменить на свою аннотацию, чтобы избежать проблем при обфукскации
    //Обфускация программ — это прорывная, самая горячая сегодня, область криптографии.

    @ViewModelKey(ExampleViewModel::class) //вместо @StringKey
    @Binds
    fun bindExampleViewModel(exampleViewModel: ExampleViewModel): ViewModel

    @IntoMap
    //@StringKey("ExampleViewModel2")
    @ViewModelKey(ExampleViewModel2::class)
    @Binds
    fun bindExampleViewModel2(exampleViewModel2: ExampleViewModel2): ViewModel
}