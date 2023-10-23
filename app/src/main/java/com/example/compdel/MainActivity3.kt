package com.example.compdel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.compdel.databinding.ActivityJalebiinfoBinding

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val Biryani = findViewById<Button>(R.id.Biryani);

        Biryani.setOnClickListener {
            val Intent = Intent(this, Biryaniinfo::class.java)
            startActivity(Intent)
        }

        val Jalebi = findViewById<Button>(R.id.Jalebi);

        Jalebi.setOnClickListener {
            val Intent = Intent(this, jalebiinfo::class.java)
            startActivity(Intent)
        }
        val Burger = findViewById<Button>(R.id.Burger);

        Burger.setOnClickListener {
            val Intent = Intent(this, Burgerinfo::class.java)
            startActivity(Intent)
        }
        val Momos = findViewById<Button>(R.id.Momos);

        Momos.setOnClickListener {
            val Intent = Intent(this, momosinfo::class.java)
            startActivity(Intent)
        }
        val Dosa = findViewById<Button>(R.id.Dosa);

        Dosa.setOnClickListener {
            val Intent = Intent(this, Dosainfo::class.java)
            startActivity(Intent)
        }

        val review = findViewById<Button>(R.id.review);

        review.setOnClickListener {
            val Intent = Intent(this, Review::class.java)
            startActivity(Intent)
        }


    }
}