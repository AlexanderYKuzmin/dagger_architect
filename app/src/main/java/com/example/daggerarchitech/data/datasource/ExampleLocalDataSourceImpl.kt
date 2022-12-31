package com.example.daggerarchitech.data.datasource

import com.example.daggerarchitech.data.database.ExampleDatabase
import javax.inject.Inject

class ExampleLocalDataSourceImpl @Inject constructor(
    private val database: ExampleDatabase
) : ExampleLocalDataSource {
    override fun method() {
        database.method()
    }
}