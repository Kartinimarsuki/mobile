package com.umkm.tehbubruk

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class Register : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnRegister: Button = findViewById(R.id.btnRegister)
        val btnBack: Button = findViewById(R.id.btnBack)
        val etName: EditText = findViewById(R.id.etName)
        val etEmail: EditText = findViewById(R.id.etEmail)
        val etRepeatPassword: EditText = findViewById(R.id.etRepeatPassword)
        val etPassword: EditText = findViewById(R.id.etPassword)
        var registerOnClick: (() -> Unit)? = null

        etPassword.setOnFocusChangeListener { v, hasFocus ->
            if(etRepeatPassword.text.toString() != etPassword.text.toString()){
                etPassword.setError("Password isn't match")
            }else{
                registerOnClick = {
                    btnRegister.setOnClickListener {
                        val login = Intent(this, Login::class.java)
                        login.putExtra("name", etName.text.toString())
                        login.putExtra("email", etEmail.text.toString())
                        login.putExtra("password", etPassword.text.toString())
                    }
                }
            }
        }
        registerOnClick()
    }
}