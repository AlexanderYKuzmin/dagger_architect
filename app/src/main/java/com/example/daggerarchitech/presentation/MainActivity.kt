package com.example.daggerarchitech.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerarchitech.R
import com.example.daggerarchitech.di.DaggerApplicationComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel

    /*private val component by lazy {
        DaggerApplicationComponent.builder()
            .context(application)
            .currentTime(System.currentTimeMillis())
            .build()
    }*/

    private val component by lazy {
        DaggerApplicationComponent.factory()
            .create(application, System.currentTimeMillis())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        component.inject(this)

        viewModel.method()


    }
}