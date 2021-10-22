package com.nerostarx.strawberry.store.ui.cart

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.VERTICAL
import com.nerostarx.strawberry.store.R
import com.nerostarx.strawberry.store.adapters.CartAdapter
import com.nerostarx.strawberry.store.databinding.FragmentCartBinding
import com.nerostarx.strawberry.store.model.OnItemClickListener

class CartFragment : Fragment() {

    private val cartViewModel: CartViewModel by activityViewModels()
    private lateinit var binding:FragmentCartBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        binding = FragmentCartBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initCart()
    }

    private fun initCart() {
        val clickListener = object : OnItemClickListener {
            override fun onClick(position: Int) {
                val navController = requireActivity().findNavController(R.id.nav_host_fragment)
                navController.navigate(R.id.cart_to_product_action)
            }
        }
        val cartRecycler = binding.cartItemsRecycler
        cartRecycler.setHasFixedSize(false)
        cartRecycler.layoutManager = LinearLayoutManager(requireContext(),VERTICAL,false)
        cartRecycler.adapter = CartAdapter(clickListener)
    }
}