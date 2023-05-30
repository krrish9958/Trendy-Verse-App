package com.project.trendyverse

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.project.trendyverse.databinding.ActivityForgetPasswordBinding
import com.project.trendyverse.databinding.ActivityMainBinding

class ForgetPassword : AppCompatActivity() {

    private lateinit var binding : ActivityForgetPasswordBinding
    private lateinit var auth : FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgetPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.resetPsswordBtn.setOnClickListener {
            resetPassword()
        }


    }

    private fun resetPassword() {
    auth = FirebaseAuth.getInstance()
        val email = binding.resetEmailEt.text.toString()
        val resetBtn = binding.resetPsswordBtn

        auth.sendPasswordResetEmail(email).addOnSuccessListener {
            Toast.makeText(this, "check your email", Toast.LENGTH_SHORT).show()

        }.addOnFailureListener {
            Toast.makeText(this, it.toString(), Toast.LENGTH_SHORT).show()

        }
    }
}