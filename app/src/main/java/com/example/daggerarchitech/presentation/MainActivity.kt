package com.example.daggerarchitech.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.daggerarchitech.ExampleApp
import com.example.daggerarchitech.R
import com.example.daggerarchitech.di.DaggerApplicationComponent
import dagger.Component
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val viewModel: ExampleViewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[ExampleViewModel::class.java]
    }

    private val viewModel2: ExampleViewModel2 by lazy {
        ViewModelProvider(this, viewModelFactory)[ExampleViewModel2::class.java]
    }

    /*private val component by lazy {
        DaggerApplicationComponent.builder()
            .context(application)
            .currentTime(System.currentTimeMillis())
            .build()
    }*/

    private val component  by lazy {
        (application as ExampleApp).component
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        component.inject(this)

        viewModel.method()
        viewModel2.method()


    }
}