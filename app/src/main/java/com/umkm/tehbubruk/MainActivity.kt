package com.umkm.tehbubruk

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRegister: Button = findViewById(R.id.btnRegister)
        val tvLogin: TextView = findViewById(R.id.tvLogin)

        btnRegister.setOnClickListener {
            val register = Intent(this, Register::class.java)
            startActivity(register)
        }
        tvLogin.setOnClickListener {
            val login = Intent(this, Login::class.java)
            startActivity(login)
        }
    }
}