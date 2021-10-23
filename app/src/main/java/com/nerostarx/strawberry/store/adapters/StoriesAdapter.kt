package com.nerostarx.strawberry.store.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.nerostarx.strawberry.store.R
import com.nerostarx.strawberry.store.model.OnItemClickListener

class StoriesAdapter(private val storyClick:OnItemClickListener )
    : RecyclerView.Adapter<StoriesAdapter.StoryHolder>() {


    override fun getItemCount(): Int = 10

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryHolder {
        val inflater = LayoutInflater.from(parent.context)
        return StoryHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: StoryHolder, position: Int) {
        if(position == 0){
            holder.storyName.text = ""
            holder.storyImage.setImageDrawable(ContextCompat.getDrawable(holder.itemView.context,R.drawable.story_item))
        }else{
            holder.storyName.text = "User"
            holder.storyImage.setImageDrawable(ContextCompat.getDrawable(holder.itemView.context,R.drawable.user))
        }

        holder.itemView.setOnClickListener {
            storyClick.onClick(position)
        }
    }

    class StoryHolder(inflater:LayoutInflater,parent:ViewGroup): RecyclerView
            .ViewHolder(inflater.inflate(R.layout.story_item,parent,false)) {

        val storyImage: ShapeableImageView = itemView.findViewById(R.id.story_image)
        val storyName: TextView = itemView.findViewById(R.id.story_name)
    }
}