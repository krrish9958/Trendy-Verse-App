package com.project.trendyverse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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
            loginUser()
        }

        binding.forgetPasswordTv.setOnClickListener{
            val intent = Intent(this , ForgetPassword::class.java)
            startActivity(intent)
        }



    }

    private fun loginUser() {
        val email = binding.emailLoginEt.text.toString()
        val password = binding.passwordLoginEt.text.toString()

        if (email.isNotEmpty() && password.isNotEmpty()){
            auth.signInWithEmailAndPassword(email, password).addOnCompleteListener {
                if (it.isSuccessful){
                    Toast.makeText(this, "Successfully Created Account!", Toast.LENGTH_SHORT).show()
                    var intent = Intent(this ,  HomePageActivity::class.java)
                    startActivity(intent)
                }else{
                    Toast.makeText(this , it.exception.toString(), Toast.LENGTH_SHORT).show()
                }
            }
        }

    }
}