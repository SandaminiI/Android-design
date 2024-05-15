package com.example.madlabexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Page12 : AppCompatActivity() {
    lateinit var btn24: Button
    lateinit var btn25: Button
    lateinit var btn26: Button
    private lateinit var img1: ImageView
    private lateinit var img2: ImageView
    private lateinit var img3: ImageView
    private lateinit var img4: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page12)

        btn24 = findViewById(R.id.btn24)
        btn24.setOnClickListener(){
            val intent = Intent(this,Page9::class.java)
            startActivity(intent)
        }

        btn25 = findViewById(R.id.btn25)
        btn25.setOnClickListener(){
            val intent = Intent(this,Page10::class.java)
            startActivity(intent)
        }

        btn26 = findViewById(R.id.btn26)
        btn26.setOnClickListener(){
            val intent = Intent(this,Page11::class.java)
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