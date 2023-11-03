package com.example.compdel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class momosinfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_momosinfo)
        val swiggymomo =findViewById<Button>(R.id.swiggymomo);

        swiggymomo.setOnClickListener {
            val Intent = Intent(this, payment::class.java)
                startActivity(Intent)

        }
         val zomomomo = findViewById<Button>(R.id.zomomomo);
        zomomomo.setOnClickListener { this
        val Intent = Intent(this,paymentzomato::class.java)
          startActivity(Intent)
        }
    }
}