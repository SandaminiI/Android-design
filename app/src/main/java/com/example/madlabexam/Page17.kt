package com.example.madlabexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Page17 : AppCompatActivity() {
    lateinit var btn38:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page17)

        btn38 = findViewById(R.id.btn38)
        btn38.setOnClickListener(){
            val intent = Intent(this,Page20::class.java)
            startActivity(intent)
        }
    }
}