package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


import com.example.poe3opsc.MenuDash
import com.example.poe3opsc.R
import com.example.poe3opsc.dress
import com.example.poe3opsc.products
import com.example.poe3opsc.wigs

class products : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_products)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val bagsName  = findViewById<Button>(R.id.bagsName)
        val DressNames = findViewById<Button>(R.id.DressNames)
        val WigsName = findViewById<Button>(R.id. WigsName)





        bagsName.setOnClickListener {
            val intent = Intent(this,bagsName::class.java)
            startActivity(intent)
        }

        DressNames.setOnClickListener {
            val intent = Intent(this, dress::class.java)
            startActivity(intent)
        }



        WigsName.setOnClickListener {
            val intent = Intent(this, wigs::class.java)
            startActivity(intent)
        }










        val backButton = findViewById<Button>(R.id.backButton)

        backButton.setOnClickListener {
            val intent = Intent(this, MenuDash::class.java)
            startActivity(intent)
        }



        supportActionBar





        }

    }
