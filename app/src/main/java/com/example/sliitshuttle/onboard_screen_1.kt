package com.example.sliitshuttle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class onboard_screen_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard_screen1)

        var circularButton = findViewById<ImageButton>(R.id.circularButton)
        circularButton.setOnClickListener {
            val intent1 = Intent(this, onboard_screen_2::class.java)
            startActivity(intent1)
        }

        var skip1 = findViewById<Button>(R.id.skip2)
        skip1.setOnClickListener {
            val intent1 = Intent(this, onboard_screen_3::class.java)
            startActivity(intent1)
        }
    }
}