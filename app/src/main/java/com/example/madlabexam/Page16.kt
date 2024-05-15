package com.example.madlabexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page16 : AppCompatActivity() {
    lateinit var btn31:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page16)


        btn31 = findViewById(R.id.btn31)
        btn31.setOnClickListener(){
            val intent = Intent(this,Page17::class.java)
            startActivity(intent)
        }
    }
}