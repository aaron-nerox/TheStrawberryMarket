package com.nerostarx.neromarket.adapters

import android.text.Layout
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nerostarx.neromarket.R

class PromoAdapter(): RecyclerView.Adapter<PromoAdapter.PromoHolder>() {

    override fun getItemCount(): Int = 3

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PromoHolder {
        val inflater = LayoutInflater.from(parent.context)
        return PromoHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: PromoHolder, position: Int) {

    }

    class PromoHolder(inflater: LayoutInflater, parent:ViewGroup): RecyclerView
    .ViewHolder(inflater.inflate(R.layout.promo_item,parent,false)) {

    }
}