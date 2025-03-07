package com.example.loginpagetest

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Main : AppCompatActivity() {
    //initializes inputs
    lateinit var usernameInput : EditText
    lateinit var passwordInput : EditText
    lateinit var loginBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_main)//Same as Flask setting first page to run

        usernameInput = findViewById(R.id.user_input)
        passwordInput = findViewById(R.id.pass_input)
        loginBtn = findViewById(R.id.login_btn)
        //check for login button press
        loginBtn.setOnClickListener {
            val username = usernameInput.text.toString() //saves user inputted username to a read-only variable
            val password = passwordInput.text.toString() //saves user inputted password to a read-only variable
            //logs username and password to check if code is working
            Log.i("Credentials", "User: $username \n Pass: $password")
            setContentView(R.layout.menu)
        }
    }
}