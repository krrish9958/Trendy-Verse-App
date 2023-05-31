package com.project.trendyverse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.project.trendyverse.databinding.ActivityHomePageBinding

class HomePageActivity : AppCompatActivity() {
            private lateinit var binding : ActivityHomePageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceFragment(HomeFragment())
        binding.bottomNavView.setOnItemSelectedListener {
            when (it.itemId){
                R.id.home ->{
                    replaceFragment(HomeFragment())
                    true
                }
                R.id.category -> {
                    replaceFragment(CategoryFragment())
                    true
                }
                R.id.cart -> {
                    replaceFragment(CartFragment())
                    true
                }
                R.id.profile -> {
                    replaceFragment(ProfileFragment())
                    true
                }
                else ->{
                    replaceFragment(HomeFragment())
                    true
                }
            }
        }




    }

    private fun replaceFragment(fragment : Fragment) {
        val fragmentManager : FragmentManager = supportFragmentManager
        val fragmentTransaction : FragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentLayout,fragment)
        fragmentTransaction.commit()

    }
}