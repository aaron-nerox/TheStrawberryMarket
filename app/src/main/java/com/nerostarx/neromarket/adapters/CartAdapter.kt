package com.nerostarx.neromarket.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nerostarx.neromarket.R
import com.nerostarx.neromarket.model.OnItemClickListener

class CartAdapter(private val clickListener: OnItemClickListener)
    :RecyclerView.Adapter<CartAdapter.CartHolder>() {


    override fun getItemCount(): Int = 3

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartHolder {
       val inflater = LayoutInflater.from(parent.context)
        return CartHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: CartHolder, position: Int) {
        holder.itemView.setOnClickListener {
            clickListener.onClick(position)
        }
    }

    class CartHolder(inflater:LayoutInflater,parent:ViewGroup)
        :RecyclerView.ViewHolder(inflater.inflate(R.layout.cart_item,parent,false)) {

    }
}