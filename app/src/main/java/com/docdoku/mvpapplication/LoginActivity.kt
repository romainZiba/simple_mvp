package com.docdoku.mvpapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_login.*

/**
 * A login screen that offers login via email/password.
 * TODO: build a MVP layer to provide authentication to your application
 * 1) If the username or password are incorrect, an error message has to be displayed to the user
 * 2) If the credentials are correct, a new Activity is started
 */
class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        // Set up the login form.
        password.setOnEditorActionListener(TextView.OnEditorActionListener { _, id, _ ->
            if (id == EditorInfo.IME_ACTION_DONE || id == EditorInfo.IME_NULL) {
                attemptLogin()
                return@OnEditorActionListener true
            }
            false
        })

        email_sign_in_button.setOnClickListener { attemptLogin() }
    }

    private fun attemptLogin() {
        TODO("implement this in a presenter") //To change body of created functions use File | Settings | File Templates.
    }
}
