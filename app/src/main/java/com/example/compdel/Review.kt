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
        val linkdinlinkButton = findViewById<Button>(R.id.linkedin)
        linkdinlinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.linkedin.com/in/shubham-kumar-tiwari-a05242215/")
            )
            startActivity(browserIntent)
        }

        val instalinkButton = findViewById<Button>(R.id.instagram)
        instalinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.instagram.com/shubham__tiwari_drdz//")
            )
            startActivity(browserIntent)
        }

        val facebooklinkButton = findViewById<Button>(R.id.facebook)
        facebooklinkButton.setOnClickListener {
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.facebook.com/profile.php?id=100007705273154/")

            )
            startActivity(browserIntent)
        }

    }
}