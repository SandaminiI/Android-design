package com.example.madlabexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Page4 : AppCompatActivity() {
    lateinit var btn5: Button
    lateinit var btn6: Button
    lateinit var f_password: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page4)

        btn5 = findViewById(R.id.btn5)
        btn5.setOnClickListener(){
            val intent = Intent(this, Page9::class.java)
            startActivity(intent)
        }

        btn6 = findViewById(R.id.btn6)
        btn6.setOnClickListener(){
            val intent = Intent(this, Page3::class.java)
            startActivity(intent)
        }

        f_password = findViewById(R.id.f_password)
        f_password.setOnClickListener(){
            val intent = Intent(this,Page5::class.java)
            startActivity(intent)
        }
    }
}