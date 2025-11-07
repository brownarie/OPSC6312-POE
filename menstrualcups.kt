package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.poe3opsc.Cartlists
import com.example.poe3opsc.R
import com.example.poe3opsc.dress
import com.google.firebase.auth.FirebaseAuth

class menstrualcups : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    private lateinit var btnSm : Button

    private lateinit var buttonMed  : Button

    private lateinit var buttonLar : Button

    private lateinit var cartPrice: Button

    private lateinit var backButton: Button



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.dress)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        auth = FirebaseAuth.getInstance()
        //The user can choose different scents
        val btnSm = findViewById<Button>(R.id.btnSm)
        val buttonMed = findViewById<Button>(R.id.buttonMed)
        val buttonLar = findViewById<Button>(R.id.buttonLar)


        //user can select sanitary options

        btnSm.setOnClickListener {
            Toast.makeText(this, " Scented clicked", Toast.LENGTH_SHORT).show()
        }

        buttonMed.setOnClickListener {
            Toast.makeText(this, "Unscented clicked", Toast.LENGTH_SHORT).show()
        }

        buttonLar.setOnClickListener {
                Toast.makeText(this, "Unscented clicked", Toast.LENGTH_SHORT).show()
            }


        //user can add to cart
        val cartPrice  = findViewById<TextView>(R.id.cartPrice)
        val  backButton = findViewById<Button>(R.id.backButton)

        cartPrice.setOnClickListener {
            val intent = Intent(this, Cartlists::class.java)
            startActivity(intent)
        }

        backButton.setOnClickListener {
            val intent = Intent(this, dress::class.java)
            startActivity(intent)
        }

    }
}