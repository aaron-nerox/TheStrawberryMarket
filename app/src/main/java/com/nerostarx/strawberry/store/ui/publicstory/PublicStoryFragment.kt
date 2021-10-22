package com.nerostarx.strawberry.store.ui.publicstory

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.nerostarx.strawberry.store.R
import com.nerostarx.strawberry.store.adapters.StoryPagerAdapter
import com.nerostarx.strawberry.store.databinding.FragmentPublicStoryBinding

class PublicStoryFragment : Fragment() {

    private val viewModel: PublicStoryViewModel by activityViewModels()
    private lateinit var binding: FragmentPublicStoryBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        binding = FragmentPublicStoryBinding.inflate(layoutInflater, container, false)
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