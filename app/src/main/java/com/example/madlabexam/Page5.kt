package com.example.madlabexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page5 : AppCompatActivity() {
    lateinit var btn7: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page5)


        btn7 = findViewById(R.id.btn7)
        btn7.setOnClickListener(){
                val intent = Intent(this, Page4::class.java)
                startActivity(intent)
        }
    }
}