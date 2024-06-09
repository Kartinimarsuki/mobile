package com.umkm.tehbubruk

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Login : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val etEmail: EditText = findViewById(R.id.etEmail)
        val etPassword: EditText = findViewById(R.id.etPassword)
        val btnLogin: Button = findViewById(R.id.btnLogin)
        val btnBack: Button = findViewById(R.id.btnBack)
        val btnGoogle: Button = findViewById(R.id.btnGoogle)
        val btnFacebook: Button = findViewById(R.id.btnFacebook)
        val tvForgetPassword: TextView = findViewById(R.id.tvForgetPassword)

        btnLogin.setOnClickListener{
            val dashboard = Intent(this, Dashboard::class.java)
            dashboard.putExtra("email", etEmail.text.toString())
            dashboard.putExtra("password", etPassword.text.toString())
            startActivity(dashboard)
        }

        btnBack.setOnClickListener {
            val main = Intent(this, MainActivity::class.java)
            startActivity(main)
        }

        tvForgetPassword.setOnClickListener {
            val register = Intent(this, Register::class.java)
            startActivity(register)
        }
    }
}