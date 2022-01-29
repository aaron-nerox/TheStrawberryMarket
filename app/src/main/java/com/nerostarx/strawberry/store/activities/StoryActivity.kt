package com.nerostarx.strawberry.store.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import com.nerostarx.strawberry.store.R

class StoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_NeroMarket)
        setContentView(R.layout.activity_story)
        val intent = intent
        val navController = findNavController(R.id.story_nav_host)

        if(intent.getStringExtra("STORY_MODE") == "USER"){
            navController.navigate(R.id.to_user_story)
        }
    }
}