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

class RegisterU : AppCompatActivity() {



    private lateinit var auth: FirebaseAuth

    private lateinit var username: EditText

    private lateinit var password: EditText

    private lateinit var buttonLogin: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register_u)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        auth = FirebaseAuth.getInstance()

        val editName = findViewById<EditText>(R.id.editName)
        val EditEmail1 = findViewById<EditText>(R.id.EditEmail1)
        val EditPassword1 = findViewById<EditText>(R.id.EditPassword1)


        val btnSign= findViewById<Button>(R.id.btnSign)
        val btnRLogin = findViewById<Button>(R.id.btnRLogin)


        btnSign.setOnClickListener {

            val email = EditEmail1 .text.toString()
            val username = editName.text.toString()
            val password = EditPassword1.text.toString()


            if (email == "") {
                EditEmail1.error = "Email cannot be empty"
                return@setOnClickListener

            }
            else if (username == "") {
                editName.error = "Username more than 8-16 characters"
                return@setOnClickListener

            }

            else if (password == "") {
                EditPassword1.error = "Password should match with confirm password"
                return@setOnClickListener
            }


        }



        val email = EditEmail1.text.toString()
        val username = editName.text.toString()
        val password = EditPassword1.text.toString()


        if (email == "") {
            editName.error = "Email cannot be empty"
            //return@setOnClickListener

        }
        else if (username == "") {
            editName.error = "Username more than 8-16 characters"
            //    return@setOnClickListener

        }

        else if (password== "") {
            EditPassword1.error = "Password should match with confirm password"
            //     return@setOnClickListener
        }

        btnRLogin.setOnClickListener {
            val intent = Intent(this, LoginU::class.java)
            startActivity(intent)
        }

        btnSign.setOnClickListener {
            val intent = Intent(this, MenuDash::class.java)
            startActivity(intent)
        }












    }


    }
