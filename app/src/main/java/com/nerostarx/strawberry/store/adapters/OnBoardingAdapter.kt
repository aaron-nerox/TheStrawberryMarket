package com.nerostarx.strawberry.store.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nerostarx.strawberry.store.R


class OnBoardingAdapter : RecyclerView.Adapter<OnBoardingAdapter.OnBoardingHolder>() {

    private var titlesList = ArrayList<String>()
    private var descriptionList = ArrayList<String>()
    private lateinit var context:Context

    fun init() {
        titlesList.addAll(arrayListOf(context.getString(R.string.title_walk1)
                ,context.getString(R.string.title_walk2)
                ,context.getString(R.string.title_walk3)))

        descriptionList.addAll(arrayListOf(
                context.getString(R.string.walk_1)
                ,context.getString(R.string.walk_2)
                ,context.getString(R.string.walk_3)
        ))
    }
    override fun getItemCount(): Int = 3

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnBoardingHolder {
        context = parent.context
        init()
        val inflater = LayoutInflater.from(context)
        return OnBoardingHolder(inflater,parent)
    }

    override fun onBindViewHolder(holder: OnBoardingHolder, position: Int) {

        holder.titleText.text = titlesList[position]
        holder.descriptionText.text = descriptionList[position]

        when(position) {
            0 ->{holder.image.setImageResource(R.drawable.main_logo)}
            1 ->{holder.image.setImageResource(R.drawable.ic_beverage)}
            2 ->{holder.image.setImageResource(R.drawable.ic_fav_drink)}
        }
    }

    class OnBoardingHolder(inflater: LayoutInflater,parent:ViewGroup)
        :RecyclerView.ViewHolder(inflater.inflate(R.layout.on_boarding_item,parent,false))
    {
        val image:ImageView = itemView.findViewById(R.id.image_desc)
        val titleText:TextView = itemView.findViewById(R.id.title_text)
        val descriptionText:TextView = itemView.findViewById(R.id.description_text)
    }
}