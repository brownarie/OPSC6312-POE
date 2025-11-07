package com.example.poe3opsc

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.products

class MenuDash : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu_dash)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Handle Category Card Clicks
        val CardClothes = findViewById<CardView>(R.id.CardClothes)



//direct user to specific page
        CardClothes.setOnClickListener {
            Toast.makeText(this, "clothes clicked", Toast.LENGTH_SHORT).show()
        }

        CardClothes.setOnClickListener {
            val intent = Intent(this, com.example.poe3opsc.products::class.java)
            startActivity(intent)
        }







    }
}