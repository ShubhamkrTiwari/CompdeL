package com.example.compdel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Biryaniinfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biryaniinfo)
        val swiggybiryani = findViewById<Button>(R.id.swiggyjalebi);

        swiggybiryani.setOnClickListener {
            val Intent = Intent(this, payment::class.java)
            startActivity(Intent)
        }
        val zomobiryani = findViewById<Button>(R.id.zomomomo);

        zomobiryani.setOnClickListener { this
        val Intent = Intent(this, paymentzomato::class.java)
        startActivity(Intent)
        }
    }
}