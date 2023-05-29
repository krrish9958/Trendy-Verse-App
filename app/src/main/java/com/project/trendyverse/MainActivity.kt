package com.project.trendyverse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import com.project.trendyverse.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
        private lateinit var binding : ActivityMainBinding
        private lateinit var auth : FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.signUpEt.setOnClickListener{
            var intent = Intent(this , SignUpActivity::class.java)
            startActivity(intent)
        }

        auth = FirebaseAuth.getInstance()

        binding.loginBtn.setOnClickListener {

        }



    }
}