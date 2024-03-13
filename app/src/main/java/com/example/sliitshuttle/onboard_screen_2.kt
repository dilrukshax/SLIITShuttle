package com.example.sliitshuttle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class onboard_screen_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard_screen2)

        var getStarted = findViewById<Button>(R.id.getStarted)
        getStarted.setOnClickListener {
            val intent1 = Intent(this, onboard_screen_3::class.java)
            startActivity(intent1)
        }
    }
}