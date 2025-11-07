package com.example.poe3opsc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.auth.FirebaseAuth

class LoginU : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var auth: FirebaseAuth



        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_u)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        auth = FirebaseAuth.getInstance()


        val EditEmail2= findViewById<EditText>(R.id.EditEmail2)
        val EditPassword13= findViewById<EditText>(R.id.EditPassword13)

        val btnLog = findViewById<Button>(R.id.btnLog)


        btnLog.setOnClickListener {

            val email = EditEmail2.text.toString()
            val password = EditPassword13.text.toString()


            if (email == "") {
                EditEmail2.error = "Email cannot be empty"
                return@setOnClickListener

            }



            else if (password == "") {
                EditPassword13.error = "Password should match with confirm password"
                return@setOnClickListener
            }


        }



        val email = EditEmail2.text.toString()
        val password =  EditPassword13.text.toString()


        if (email == "") {
            EditEmail2.error = "Email cannot be empty"
            //return@setOnClickListener

        }


        else if (password== "") {
            EditPassword13.error = "Password should match with confirm password"
            //     return@setOnClickListener
        }



        btnLog.setOnClickListener {
            val intent = Intent(this, MenuDash::class.java)
            startActivity(intent)
        }



    }
}