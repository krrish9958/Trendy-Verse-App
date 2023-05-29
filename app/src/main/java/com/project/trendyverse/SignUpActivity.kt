package com.project.trendyverse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.project.trendyverse.databinding.ActivityMainBinding
import com.project.trendyverse.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySignUpBinding
    private lateinit var auth : FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        binding.signUpBtn.setOnClickListener {
            signInUser()
        }

    }

    private fun signInUser() {
        val email = binding.userMail.text.toString()
        val password = binding.passwordEt.text.toString()
        val reEnterPassword = binding.rePasswordEt.text.toString()


        if (email.isNotEmpty()&& password.isNotEmpty()&&reEnterPassword==password){
            auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener {
                if (it.isSuccessful){
                    auth.signInWithEmailAndPassword(email, password).addOnCompleteListener {
                        if (it.isSuccessful){
                            Toast.makeText(this, "Successfully Created Account!",Toast.LENGTH_SHORT).show()
                            var intent = Intent(this ,  HomePageActivity::class.java)
                            startActivity(intent)
                        }else{
                            Toast.makeText(this , it.exception.toString(), Toast.LENGTH_SHORT).show()
                        }
                    }
                } else{
                    Toast.makeText(this , it.exception.toString(), Toast.LENGTH_SHORT).show()

                }
            }

        }
    }
}