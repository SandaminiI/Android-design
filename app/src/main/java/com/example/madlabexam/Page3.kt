package com.example.madlabexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var btn3: Button
        lateinit var btn4: Button

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)
        btn3 = findViewById(R.id.btn3)
        btn3.setOnClickListener(){
            val intent = Intent(this, Page9::class.java)
            startActivity(intent)
        }

        btn4 = findViewById(R.id.btn4)
        btn4.setOnClickListener(){
            val intent = Intent(this, Page4::class.java)
            startActivity(intent)
        }
    }
}