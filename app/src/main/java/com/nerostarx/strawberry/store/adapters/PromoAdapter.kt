package com.nerostarx.strawberry.store.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nerostarx.strawberry.R
import com.nerostarx.strawberry.store.model.OnItemClickListener

class PromoAdapter(private val clickListener:OnItemClickListener)
    : RecyclerView.Adapter<PromoAdapter.PromoHolder>() {

    override fun getItemCount(): Int = 3

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PromoHolder {
        val inflater = LayoutInflater.from(parent.context)
        return PromoHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: PromoHolder, position: Int) {
        holder.itemView.setOnClickListener {
            clickListener.onClick(position)
        }
    }

    class PromoHolder(inflater: LayoutInflater, parent:ViewGroup): RecyclerView
    .ViewHolder(inflater.inflate(R.layout.promo_item,parent,false)) {

    }
}