package com.nerostarx.strawberry.store.ui.about

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.nerostarx.strawberry.R
import com.nerostarx.strawberry.databinding.FragmentAboutBinding

class AboutFragment : Fragment() {

    private val aboutViewModel: AboutViewModel by activityViewModels()
    private lateinit var binding:FragmentAboutBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_about, container, false)
        return binding.root
    }
}