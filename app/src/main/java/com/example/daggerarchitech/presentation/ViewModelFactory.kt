package com.example.daggerarchitech.presentation

import android.view.View
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.daggerarchitech.domain.ExampleUseCase
import javax.inject.Inject
import javax.inject.Provider

/*class ViewModelFactory @Inject constructor(
    private val exampleUseCase: ExampleUseCase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass == ExampleViewModel::class.java) {
            return ExampleViewModel(exampleUseCase) as T
        }
        throw java.lang.RuntimeException("Unknown Viewmodel class.")
    }
}*/

/*class ViewModelFactory @Inject constructor(
    private val viewModels: @JvmSuppressWildcards Map<String, ViewModel>
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return viewModels[modelClass.simpleName] as T
    }
}*/

class ViewModelFactory @Inject constructor(
    //private val viewModelsProviders: @JvmSuppressWildcards Map<String, Provider<ViewModel>>
    private val viewModelsProviders: @JvmSuppressWildcards Map<Class<out ViewModel>, Provider<ViewModel>> //В качестве ключа
//используем класс наследник ViewModel
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return viewModelsProviders[modelClass]?.get() as T // если надо создавать каждый раз viewmodel заново после уничтожения activity
    }
}