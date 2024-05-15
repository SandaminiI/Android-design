package com.example.madlabexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Page11 : AppCompatActivity() {
    lateinit var btn21: Button
    lateinit var btn22: Button
    lateinit var btn23: Button
    private lateinit var img1: ImageView
    private lateinit var img2: ImageView
    private lateinit var img3: ImageView
    private lateinit var img4: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page11)

        btn21 = findViewById(R.id.btn21)
        btn21.setOnClickListener(){
            val intent = Intent(this,Page9::class.java)
            startActivity(intent)
        }

        btn22 = findViewById(R.id.btn22)
        btn22.setOnClickListener(){
            val intent = Intent(this,Page10::class.java)
            startActivity(intent)
        }

        btn23 = findViewById(R.id.btn23)
        btn23.setOnClickListener(){
            val intent = Intent(this,Page12::class.java)
            startActivity(intent)
        }

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