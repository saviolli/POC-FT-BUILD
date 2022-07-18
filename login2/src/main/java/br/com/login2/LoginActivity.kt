package br.com.login2

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.router.NavigatorFactory

class LoginActivity  : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findViewById<Button>(R.id.btn_login).setOnClickListener {
            doLogin()
        }
    }

    private fun doLogin() {
        if (BuildConfig.NATIVE_HOME) {
            NavigatorFactory.navigator?.navigate(this, "home")
            return
        }

        Toast.makeText(this, "Under development", Toast.LENGTH_LONG).show()
    }
}