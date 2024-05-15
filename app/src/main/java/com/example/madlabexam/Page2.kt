package com.example.madlabexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var btn1: Button
        lateinit var btn2: Button

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        btn1 = findViewById(R.id.btn1)
        btn1.setOnClickListener(){
            val intent = Intent(this, Page3::class.java)
            startActivity(intent)
        }

        btn2 = findViewById(R.id.btn2)
        btn2.setOnClickListener(){
            val intent = Intent(this, Page4::class.java)
            startActivity(intent)
        }
    }
}