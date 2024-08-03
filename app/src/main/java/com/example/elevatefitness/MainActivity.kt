package com.example.elevatefitness

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tv_forgotpass = findViewById<TextView>(R.id.forgotpassword)
        var loginbtn = findViewById<Button>(R.id.loginbtn)
        var signupbtn = findViewById<Button>(R.id.signinbtn)




    }
}