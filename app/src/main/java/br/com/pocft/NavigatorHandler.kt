package br.com.pocft

import android.content.Context
import android.content.Intent
import br.com.home.HomeActivity
import br.com.login2.LoginActivity
import br.com.router.Navigator
import br.com.router.NavigatorBuilder

class NavigatorHandler : Navigator {

    init {
        NavigatorBuilder(this).build()
    }

    override fun navigate(context: Context, route: String) {
        val activity = when (route) {
            "login" -> LoginActivity()
            "home" -> HomeActivity()
            else -> null
        }

        activity?.let {
            val intent = Intent(context, activity::class.java)
            context.startActivity(intent)
        }
    }
}
