package com.nerostarx.neromarket.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nerostarx.neromarket.R

class StoriesAdapter(): RecyclerView.Adapter<StoriesAdapter.StoryHolder>() {


    override fun getItemCount(): Int = 6

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryHolder {
        val inflater = LayoutInflater.from(parent.context)
        return StoryHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: StoryHolder, position: Int) {

    }

    class StoryHolder(inflater:LayoutInflater,parent:ViewGroup): RecyclerView
            .ViewHolder(inflater.inflate(R.layout.story_item,parent,false))
    {

    }
}