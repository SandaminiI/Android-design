package com.example.madlabexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page15 : AppCompatActivity() {
    lateinit var btn36: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page15)

        btn36 = findViewById(R.id.btn36)
        btn36.setOnClickListener(){
            val intent = Intent(this,Page16::class.java)
            startActivity(intent)
        }

    }
}