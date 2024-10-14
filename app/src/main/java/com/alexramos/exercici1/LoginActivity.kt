package com.alexramos.exercici1


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val fullName: EditText = findViewById(R.id.fullName)
        val email: EditText = findViewById(R.id.email)
        val phoneNumber: EditText = findViewById(R.id.phoneNumber)
        val password: EditText = findViewById(R.id.password)
        val signUpButton: Button = findViewById(R.id.signUpButton)

        signUpButton.setOnClickListener {
            // Aquí puedes agregar la lógica para registrar al usuario
            Toast.makeText(this, "Cuenta creada para ${fullName.text}", Toast.LENGTH_SHORT).show()
        }
    }
}