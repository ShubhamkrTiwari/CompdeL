package com.example.compdel

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Review : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review)
        setupLinkButton()
    }

    fun setupLinkButton() {
        val linkButton = findViewById<Button>(R.id.linkedin)
        linkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.linkedin.com/in/shubham-kumar-tiwari-a05242215/")
            )
            startActivity(browserIntent)

            val linkButton = findViewById<Button>(R.id.instagram)
            linkButton.setOnClickListener {
                val browserIntent = Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.instagram.com/shubham__tiwari_drdz//")
                )
                startActivity(browserIntent)

                val linkButton = findViewById<Button>(R.id.review1)
                linkButton.setOnClickListener {
                    val browserIntent = Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSfHizIR7IOoE5SiQxg5boc-LFKOIQr_-4Eayha2Swe9puHqzQ/viewform?usp=sf_link/")
                    )
                    startActivity(browserIntent)

                }
            }
        }
    }
}