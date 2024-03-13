package com.example.sliitshuttle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        var circularButton1 = findViewById<ImageButton>(R.id.circularButton1)
        circularButton1.setOnClickListener {
            val intent1 = Intent(this, onboard_screen_1::class.java)
            startActivity(intent1)
        }

        var skip1 = findViewById<Button>(R.id.skip1)
        skip1.setOnClickListener {
            val intent1 = Intent(this, onboard_screen_3::class.java)
            startActivity(intent1)
        }
    }
}