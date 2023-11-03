package com.example.compdel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Burgerinfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_burgerinfo)

        val swiggyburger =findViewById<Button>(R.id.swiggyjalebi);
        swiggyburger.setOnClickListener {
            val Intent = Intent(this, payment::class.java)
            startActivity(Intent)
        }
        val zomoburger = findViewById<Button>(R.id.zomomomo);
        zomoburger.setOnClickListener { this
        val Intent = Intent(this, paymentzomato::class.java)
           startActivity(Intent)
        }
    }
}