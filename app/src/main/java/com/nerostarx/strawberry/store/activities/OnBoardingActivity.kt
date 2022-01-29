package com.nerostarx.strawberry.store.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2.ORIENTATION_HORIZONTAL
import com.nerostarx.strawberry.store.R
import com.nerostarx.strawberry.store.adapters.OnBoardingAdapter
import com.nerostarx.strawberry.store.databinding.ActivityOnboardingBinding

class OnBoardingActivity : AppCompatActivity() {

    private lateinit var binding:ActivityOnboardingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_NeroMarket)
        binding = ActivityOnboardingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() {
        val sharedPreferences = getSharedPreferences("THE_STRAWBERRY", MODE_PRIVATE)
        val intent = Intent(this,MarketActivity::class.java)

        if(sharedPreferences.getBoolean("IS_FIRST_LAUNCH",false)){
            startActivity(intent).also {
                finish()
            }
        }

        val goMarketButton = binding.goHomeButton
        val onBoardingPager = binding.onboardingPager

        onBoardingPager.orientation = ORIENTATION_HORIZONTAL
        onBoardingPager.adapter = OnBoardingAdapter()

        goMarketButton.setOnClickListener {
            startActivity(intent).also {
                sharedPreferences.edit().putBoolean("IS_FIRST_LAUNCH",true).apply()
                finish()
            }
        }

    }
}