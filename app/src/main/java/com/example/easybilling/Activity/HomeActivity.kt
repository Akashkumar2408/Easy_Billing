package com.example.easybilling.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.easybilling.R
import com.example.easybilling.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mobailBtn.setOnClickListener {
            startActivity(Intent(this,FormActivity::class.java))
        }
        binding.accessoriesBtn.setOnClickListener {
            startActivity(Intent(this,FormActivity::class.java))
        }


    }
}