package com.nerostarx.neromarket.ui.cart

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.VERTICAL
import com.nerostarx.neromarket.R
import com.nerostarx.neromarket.adapters.CartAdapter
import com.nerostarx.neromarket.databinding.FragmentCartBinding

class CartFragment : Fragment() {

    private val cartViewModel: CartViewModel by activityViewModels()
    private lateinit var binding:FragmentCartBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_cart, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initCart()
    }

    private fun initCart() {
        val cartRecycler = binding.cartItemsRecycler
        cartRecycler.setHasFixedSize(false)
        cartRecycler.layoutManager = LinearLayoutManager(requireContext(),VERTICAL,false)
        cartRecycler.adapter = CartAdapter()
    }
}