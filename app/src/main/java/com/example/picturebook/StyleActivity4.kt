package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StyleActivity4 : AppCompatActivity() {
    lateinit var btnNext4:Button
    lateinit var btnPrevious3:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_style4)
        btnNext4= findViewById(R.id.btnNext4)
        btnPrevious3 = findViewById(R.id.btnPrevious3)

        btnPrevious3.setOnClickListener {
            val intent = Intent(this, StyleActivity3::class.java)
            startActivity(intent)
        }
        btnNext4.setOnClickListener {
            val intent = Intent(this, StyleActivity5::class.java)
            startActivity(intent)
        }
    }
}