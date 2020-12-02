package com.nerostarx.neromarket.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.viewpager2.widget.ViewPager2.ORIENTATION_HORIZONTAL
import androidx.viewpager2.widget.ViewPager2.ORIENTATION_VERTICAL
import com.nerostarx.neromarket.R
import com.nerostarx.neromarket.adapters.OnBoardingAdapter
import com.nerostarx.neromarket.databinding.ActivityOnboardingBinding

class OnBoardingActivity : AppCompatActivity() {

    private lateinit var binding:ActivityOnboardingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_onboarding)

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