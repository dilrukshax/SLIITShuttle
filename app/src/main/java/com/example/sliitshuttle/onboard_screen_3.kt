package com.example.sliitshuttle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class onboard_screen_3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard_screen3)

        var signin = findViewById<Button>(R.id.singin)
        signin.setOnClickListener {
            val intent1 = Intent(this, Sign_In::class.java)
            startActivity(intent1)
        }

        var signup = findViewById<Button>(R.id.signup)
        signup.setOnClickListener {
            val intent1 = Intent(this, Sign_Up::class.java)
            startActivity(intent1)
        }
    }
}