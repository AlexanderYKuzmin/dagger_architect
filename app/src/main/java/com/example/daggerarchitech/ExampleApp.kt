package com.example.daggerarchitech

import android.app.Application
import com.example.daggerarchitech.di.DaggerApplicationComponent

class ExampleApp: Application() {
    val component by lazy {
        DaggerApplicationComponent.factory()
            .create(this, System.currentTimeMillis())
    }
}