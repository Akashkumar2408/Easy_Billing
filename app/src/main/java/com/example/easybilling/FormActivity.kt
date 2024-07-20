package com.example.easybilling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.easybilling.databinding.ActivityFormBinding

class FormActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFormBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityFormBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}