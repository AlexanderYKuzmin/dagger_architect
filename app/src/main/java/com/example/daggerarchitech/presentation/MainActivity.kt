package com.example.daggerarchitech.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerarchitech.R
import com.example.daggerarchitech.di.ContextModule
import com.example.daggerarchitech.di.DaggerApplicationComponent
import com.example.daggerarchitech.di.DataModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel

    private val component by lazy {
        DaggerApplicationComponent.builder()
            .contextModule(ContextModule(this))
            .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        component.inject(this)

        viewModel.method()


    }
}