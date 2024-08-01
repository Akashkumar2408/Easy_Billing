package com.example.easybilling.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.easybilling.databinding.ActivitySigninBinding

class SignInActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySigninBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivitySigninBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



    }
}