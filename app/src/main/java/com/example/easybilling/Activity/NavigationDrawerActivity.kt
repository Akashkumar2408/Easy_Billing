package com.example.easybilling.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.easybilling.R
import com.example.easybilling.databinding.ActivityNavigationDrawerBinding

class NavigationDrawerActivity : AppCompatActivity() {
    lateinit var binding: ActivityNavigationDrawerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityNavigationDrawerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.homePage.mobailBtn.setOnClickListener {
            startActivity(Intent(this,FormActivity::class.java))
        }
        binding.homePage.accessoriesBtn.setOnClickListener {
            startActivity(Intent(this,FormActivity::class.java))
        }

    }
}