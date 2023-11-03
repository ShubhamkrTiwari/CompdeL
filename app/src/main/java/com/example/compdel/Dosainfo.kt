package com.example.compdel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Dosainfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dosainfo)
        val swiggydosa = findViewById<Button>(R.id.swiggydosa);
        swiggydosa.setOnClickListener { this
        val Intent= Intent(this, payment::class.java)
            startActivity(Intent)
        }
        val zomodosa = findViewById<Button>(R.id.zomodosa);
        zomodosa.setOnClickListener { this
        val Intent = Intent(this, paymentzomato::class.java)
          startActivity(Intent)
        }
    }
}