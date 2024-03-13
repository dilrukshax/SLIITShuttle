package com.example.sliitshuttle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var imageButton1 = findViewById<ImageButton>(R.id.imageButton1)
        imageButton1.setOnClickListener {
            val intent1 = Intent(this, select_bus_screen::class.java)
            startActivity(intent1)
        }

//        Navigation bar

        var imageViewHome = findViewById<ImageButton>(R.id.imageViewHome)
        imageViewHome.setOnClickListener {
            val intent1 = Intent(this, Home::class.java)
            startActivity(intent1)
        }

        var imageViewCard = findViewById<ImageButton>(R.id.imageViewCard)
        imageViewCard.setOnClickListener {
            val intent1 = Intent(this, payment::class.java)
            startActivity(intent1)
        }

        var imageViewQR = findViewById<ImageButton>(R.id.imageViewQR)
        imageViewQR.setOnClickListener {
            val intent1 = Intent(this, QR_code::class.java)
            startActivity(intent1)
        }

        var imageViewProfile = findViewById<ImageButton>(R.id.imageViewProfile)
        imageViewProfile.setOnClickListener {
            val intent1 = Intent(this, profile::class.java)
            startActivity(intent1)
        }
    }
}