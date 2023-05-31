package com.project.trendyverse

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.firebase.auth.FirebaseAuth
import com.project.trendyverse.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {


    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)


        // Inflate the layout for this fragment
            binding.logOutBtn.setOnClickListener {
                FirebaseAuth.getInstance().signOut()
                startActivity(Intent (requireContext(), MainActivity::class.java))
            }

        return binding.root
    }


}