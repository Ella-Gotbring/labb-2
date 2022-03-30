package com.els.labb2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /** changed activity.main to activity_login */
        setContentView(R.layout.activity_login)
        println("Loaded LoginActivity")

        /** define and find the button with id  */
        val button2 = findViewById<Button>(R.id.button2)
        val textPassword = findViewById<EditText>(R.id.textPassword)
        val textEmail = findViewById<EditText>(R.id.textEmail)
        /** added setOnClickListener that runs code if the button gets pressed*/
        /** define intent and what activity we want to change to*/
        button2.setOnClickListener{
            val text = textPassword.text.toString()
            val text2 = textEmail.text.toString()

            val intent = Intent(this, MainActivity::class.java)
            /** send user info back to MainActivity */
            intent.putExtra("Email", text2)
            intent.putExtra("Password", text)
            startActivity(intent)

            println(" Button pressed -> MainActivity")
        }



        /* TODO - Add missing LOGIN button to activity_login.xml */
        /* TODO - Input type should be: Password and Email types. (check XML)   */
        /* TODO - .apply to send user information from input field BACK to MainActivity */
    }
}