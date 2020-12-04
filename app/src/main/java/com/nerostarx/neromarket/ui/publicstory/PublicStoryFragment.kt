package com.nerostarx.neromarket.ui.publicstory

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.viewpager2.widget.ViewPager2.ORIENTATION_HORIZONTAL
import com.nerostarx.neromarket.R
import com.nerostarx.neromarket.adapters.StoryPagerAdapter
import com.nerostarx.neromarket.databinding.FragmentPublicStoryBinding

class PublicStoryFragment : Fragment() {

    private val viewModel: PublicStoryViewModel by activityViewModels()
    private lateinit var binding: FragmentPublicStoryBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil
            .inflate(layoutInflater,R.layout.fragment_public_story, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initStoriesPager()
    }

    private fun initStoriesPager() {
        val storiesPager = binding.publicStoriesPager
        storiesPager.adapter = StoryPagerAdapter()
    }

}