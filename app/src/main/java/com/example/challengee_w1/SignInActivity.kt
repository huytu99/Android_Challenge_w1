package com.example.challengee_w1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val btnSignIn = findViewById<MaterialButton>(R.id.btn_sign_in)
        btnSignIn.setOnClickListener {
            val intent = Intent(this,VerificationActivity::class.java)
            startActivity(intent)
        }
    }
}