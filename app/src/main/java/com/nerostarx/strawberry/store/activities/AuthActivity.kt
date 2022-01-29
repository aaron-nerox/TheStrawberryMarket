package com.nerostarx.strawberry.store.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nerostarx.strawberry.store.R
import com.nerostarx.strawberry.store.databinding.ActivityAuthBinding


class AuthActivity : AppCompatActivity() {

    private lateinit var binding:ActivityAuthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_NeroMarket)
        binding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}