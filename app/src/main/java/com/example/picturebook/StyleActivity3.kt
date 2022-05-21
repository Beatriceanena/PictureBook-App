package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StyleActivity3 : AppCompatActivity() {
    lateinit var btnPrevious2:Button
    lateinit var btnNext3:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_style_activit3)
        btnNext3 = findViewById(R.id.btnNext3)
        btnPrevious2 = findViewById(R.id.btnPrevious2)
        btnPrevious2.setOnClickListener {
            val intent = Intent(this, StyleActivity2::class.java)
            startActivity(intent)
        }

        btnNext3.setOnClickListener {
            val intent = Intent(this, StyleActivity4::class.java)
            startActivity(intent)
        }
    }
}