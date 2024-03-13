package com.example.sliitshuttle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var icon = findViewById<ImageButton>(R.id.icon)
        icon.setOnClickListener {
            val intent1 = Intent(this, welcome::class.java)
            startActivity(intent1)
        }
    }


}