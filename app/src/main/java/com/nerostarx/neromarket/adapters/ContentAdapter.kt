package com.nerostarx.neromarket.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.nerostarx.neromarket.R
import com.nerostarx.neromarket.model.OnItemClickListener

class ContentAdapter(private val clickListener: OnItemClickListener)
    : RecyclerView.Adapter<ContentAdapter.ContentHolder>(){


    override fun getItemCount(): Int = 3

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ContentHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: ContentHolder, position: Int) {
        holder.itemView.setOnClickListener {
            clickListener.onClick(position)
        }
    }

    class ContentHolder(inflater: LayoutInflater, parent:ViewGroup): RecyclerView
            .ViewHolder(inflater.inflate(R.layout.content_item,parent,false))
    {
                val image:ShapeableImageView = itemView.findViewById(R.id.product_preview)
    }
}