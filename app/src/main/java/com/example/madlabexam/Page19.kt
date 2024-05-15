package com.example.madlabexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Page19 : AppCompatActivity() {
    private lateinit var img1: ImageView
    private lateinit var img2: ImageView
    private lateinit var img3: ImageView
    private lateinit var img4: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page19)

        img1 = findViewById(R.id.v1)
        img1.setOnClickListener(){
            val intent = Intent(this, Page9::class.java)
            startActivity(intent)
        }

        img2 = findViewById(R.id.v2)
        img2.setOnClickListener(){
            val intent = Intent(this, Page14::class.java)
            startActivity(intent)
        }

        img3 = findViewById(R.id.v3)
        img3.setOnClickListener(){
            val intent = Intent(this, Page19::class.java)
            startActivity(intent)
        }

        img4 = findViewById(R.id.v4)
        img4.setOnClickListener(){
            val intent = Intent(this, Page18::class.java)
            startActivity(intent)
        }

    }
}