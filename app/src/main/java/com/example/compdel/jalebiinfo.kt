package com.example.compdel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class jalebiinfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jalebiinfo);
        val swiggyjalebi = findViewById<Button>(R.id.swiggyjalebi)
        swiggyjalebi.setOnClickListener {
            val Intent = Intent(this, payment::class.java)
            startActivity(Intent)
        }
         val zomojalebi = findViewById<Button>(R.id.zomomomo)
        zomojalebi.setOnClickListener { this
         val Intent = Intent(this, paymentzomato::class.java )
           startActivity(Intent)

        }
    }
}