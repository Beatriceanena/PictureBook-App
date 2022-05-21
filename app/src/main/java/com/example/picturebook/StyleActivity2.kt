package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StyleActivity2 : AppCompatActivity() {
    lateinit var btnPrevious1:Button
    lateinit var btnNext2:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_style3)
        btnNext2 = findViewById(R.id.btnNext2)
        btnPrevious1 = findViewById(R.id.btnPrevious1)
        btnNext2.setOnClickListener {
            val intent = Intent(this, StyleActivity3::class.java)
            startActivity(intent)
        }
        btnPrevious1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}