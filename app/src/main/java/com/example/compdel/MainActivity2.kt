package com.example.compdel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnOk = findViewById<Button>(R.id.btnOk);

        btnOk.setOnClickListener {
            val Intent = Intent(this, MainActivity3::class.java)
            startActivity(Intent)


            val text = "Opening!"
            val toast = Toast.makeText(this, text, Toast.LENGTH_SHORT)
            toast.show()
        }

        val aboutus = findViewById<Button>(R.id.aboutus);

            aboutus.setOnClickListener {
                val Intent = Intent(this, MainActivity4::class.java)
                startActivity(Intent)
            }

    }
}
