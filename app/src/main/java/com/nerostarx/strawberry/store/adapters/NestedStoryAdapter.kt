package com.nerostarx.strawberry.store.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nerostarx.strawberry.R

class NestedStoryAdapter():RecyclerView.Adapter<NestedStoryAdapter.NestedHolder>(){

    override fun getItemCount(): Int = 4

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NestedHolder {
        val inflater = LayoutInflater.from(parent.context)
        return NestedHolder(inflater,parent)
    }

    override fun onBindViewHolder(holder: NestedHolder, position: Int) {

    }

    class NestedHolder(layoutInflater: LayoutInflater,parent:ViewGroup) :RecyclerView
    .ViewHolder(layoutInflater.inflate(R.layout.nested_story,parent,false))
    {

    }

}