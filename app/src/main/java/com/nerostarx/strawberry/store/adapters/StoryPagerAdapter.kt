package com.nerostarx.strawberry.store.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.nerostarx.strawberry.store.R

class StoryPagerAdapter():RecyclerView.Adapter<StoryPagerAdapter.StoryPagerHolder>() {

    override fun getItemCount(): Int = 6

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryPagerHolder {
        val inflater = LayoutInflater.from(parent.context)
        return StoryPagerHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: StoryPagerHolder, position: Int) {
        holder.nestedStoryPager.adapter = NestedStoryAdapter()
        /*TabLayoutMediator(holder.tabLayout, holder.nestedStoryPager)
        { _: TabLayout.Tab?, _: Int -> }.attach()*/

        holder.nextButton.setOnClickListener {
            holder.nestedStoryPager.currentItem ++
        }

        holder.previousButton.setOnClickListener {
            if(holder.nestedStoryPager.currentItem > 0){
                holder.nestedStoryPager.currentItem--
            }
        }
    }

    class StoryPagerHolder(inflater: LayoutInflater, parent: ViewGroup)
        :RecyclerView.ViewHolder(inflater.inflate(R.layout.nested_stories_item, parent, false))
    {
        val nestedStoryPager:ViewPager2 = itemView.findViewById(R.id.images_pager)
        val nextButton: Button = itemView.findViewById(R.id.next_button)
        val previousButton:Button = itemView.findViewById(R.id.previous_button)
    }
}