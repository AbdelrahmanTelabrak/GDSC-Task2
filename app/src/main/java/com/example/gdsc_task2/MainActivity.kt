package com.example.gdsc_task2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.button.MaterialButton

lateinit var buttonRegister : MaterialButton
lateinit var buttonLogin : MaterialButton

lateinit var editTextEmail : EditText
lateinit var editTextPassword : EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonRegister = findViewById(R.id.btn_register)
        buttonLogin = findViewById(R.id.btn_signIn)
        editTextEmail = findViewById(R.id.tie_email)
        editTextPassword = findViewById(R.id.tie_password)

        buttonRegister.setOnClickListener{
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
        buttonLogin.setOnClickListener {

            val email = editTextEmail.text.toString()
            val password = editTextPassword.text.toString()

            if(email.isEmpty() || password.isEmpty()){
                Toast.makeText(this, "Enter email and password" , Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val intent = Intent(this, SecondMainActivity::class.java)
            startActivity(intent)
        }
    }
}