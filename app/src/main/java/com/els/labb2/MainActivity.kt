package com.els.labb2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.els.labb2.ViewModel.UserViewModel

/* TODO READ THE README FILE FIRST */

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /** define and find with id  */
        val mainButton = findViewById<Button>(R.id.mainButton)
        val intent = intent
        val email = intent.getStringExtra("Email")
        val password = intent.getStringExtra("Password")

        viewModel = ViewModelProvider(this)[UserViewModel::class.java]

        /** added setOnClickListener that runs code if the button gets pressed*/
        /** define intent and what activity we want to change*/
        mainButton.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            println(" Button pressed -> LoginActivity")
        }

        /** show email and password from the user input  */

        val greeting = findViewById<TextView>(R.id.greeting)

        greeting.text = "Email: $email\nPassword: $password"

    }
}


