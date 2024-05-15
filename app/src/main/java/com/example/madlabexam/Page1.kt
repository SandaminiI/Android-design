package com.example.madlabexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Page1 : AppCompatActivity() {
    private lateinit var img1: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page1)

        img1 = findViewById(R.id.imgg)
        img1.setOnClickListener(){
            val intent = Intent(this, Page2::class.java)
            startActivity(intent)
        }
    }
}