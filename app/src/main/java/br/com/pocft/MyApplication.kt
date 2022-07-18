package br.com.pocft

import android.app.Application

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        NavigatorHandler()
    }
}