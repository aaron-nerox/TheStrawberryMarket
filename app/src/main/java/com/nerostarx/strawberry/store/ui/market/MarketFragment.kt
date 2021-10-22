package com.nerostarx.strawberry.store.ui.market

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nerostarx.strawberry.store.R
import com.nerostarx.strawberry.store.activities.StoryActivity
import com.nerostarx.strawberry.store.adapters.ContentAdapter
import com.nerostarx.strawberry.store.adapters.PromoAdapter
import com.nerostarx.strawberry.store.adapters.StoriesAdapter
import com.nerostarx.strawberry.store.databinding.FragmentMarketBinding
import com.nerostarx.strawberry.store.model.OnItemClickListener

class MarketFragment : Fragment() {

    private val marketViewModel: MarketViewModel by activityViewModels()
    private lateinit var binding:FragmentMarketBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        binding = FragmentMarketBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initStory()
        initProducts()
        initPromo()
    }

    private fun initStory() {
        val storyClick = object : OnItemClickListener{
            override fun onClick(position: Int) {
                val intent = Intent(requireActivity(), StoryActivity::class.java)
                if(position == 0){
                    intent.putExtra("STORY_MODE", "USER")
                }
                startActivity(intent)
            }
        }
        val storyRecycler = binding.storiesRecycler
        storyRecycler.setHasFixedSize(false)
        storyRecycler.layoutManager = LinearLayoutManager(requireContext(),RecyclerView.HORIZONTAL
                ,false)
        storyRecycler.adapter = StoriesAdapter(storyClick)
    }


    private fun initProducts() {
        val clickListener = object : OnItemClickListener{
            override fun onClick(position: Int) {
                val navController = requireActivity().findNavController(R.id.nav_host_fragment)
                navController.navigate(R.id.to_product_action)
            }
        }
        val productRecycler = binding.productRecycler
        productRecycler.setHasFixedSize(true)
        productRecycler.isNestedScrollingEnabled = false
        productRecycler.layoutManager = GridLayoutManager(requireContext(),2
                ,RecyclerView.VERTICAL,false)
        productRecycler.adapter = ContentAdapter(clickListener)
    }

    private fun initPromo() {
        val clickListener = object : OnItemClickListener{
            override fun onClick(position: Int) {
                val navController = requireActivity().findNavController(R.id.nav_host_fragment)
                navController.navigate(R.id.to_product_action)
            }
        }
        val promoPager = binding.promoPager
        promoPager.adapter = PromoAdapter(clickListener)
    }
}