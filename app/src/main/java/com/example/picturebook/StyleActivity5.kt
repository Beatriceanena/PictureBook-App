package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StyleActivity5 : AppCompatActivity() {
    lateinit var btnNext5: Button
    lateinit var btnPrevious4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_style5)
        btnNext5 = findViewById(R.id.btnNext5)
        btnPrevious4 = findViewById(R.id.btnPrevious4)

        btnPrevious4.setOnClickListener {
            val intent = Intent(this, StyleActivity4::class.java)
            startActivity(intent)
        }
        btnNext5.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}