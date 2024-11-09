package com.example.sazzad_91_locationsharingapp.view

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sazzad_91_locationsharingapp.R
import com.example.sazzad_91_locationsharingapp.databinding.ActivitySplashScreenBinding

class SplashScreen : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize the binding object
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set onClick listeners for the buttons
        binding.loginBtnsplash.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }

    }
}