package com.nerostarx.strawberry.store.ui.confirmregister

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.nerostarx.strawberry.R
import com.nerostarx.strawberry.databinding.FragmentConfirmBinding

class ConfirmFragment : Fragment() {

    private val viewModel: ConfirmViewModel by activityViewModels()
    private lateinit var binding:FragmentConfirmBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_confirm, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val navigator = requireActivity().findNavController(R.id.auth_nav_host)

        binding.codeConfirmButton.setOnClickListener {
            requireActivity().finish()
        }

        binding.removeAccButton.setOnClickListener {
            navigator.navigate(R.id.to_login_action)
        }
    }

}