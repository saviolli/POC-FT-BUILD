package br.com.router

import android.content.Context

interface Navigator {
    fun navigate(context: Context, route: String)
}