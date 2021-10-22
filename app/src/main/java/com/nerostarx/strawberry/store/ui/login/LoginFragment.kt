package com.nerostarx.strawberry.store.ui.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.nerostarx.strawberry.store.R
import com.nerostarx.strawberry.store.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private val viewModel: LoginViewModel by activityViewModels()
    private lateinit var binding:FragmentLoginBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        binding = FragmentLoginBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val navigator = requireActivity().findNavController(R.id.auth_nav_host)
        binding.goRegisterButton.setOnClickListener {
            navigator.navigate(R.id.to_register_action)
        }
    }

}