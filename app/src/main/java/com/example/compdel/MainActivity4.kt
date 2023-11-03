package com.example.compdel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
         val returnmenu = findViewById<Button>(R.id.returnmenu);
         returnmenu.setOnClickListener {
         val Intent = Intent(this, MainActivity2::class.java)
             startActivity(Intent)

         }
    }
}
