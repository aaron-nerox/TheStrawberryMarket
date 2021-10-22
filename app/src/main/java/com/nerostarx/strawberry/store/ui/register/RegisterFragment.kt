package com.nerostarx.strawberry.store.ui.register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.nerostarx.strawberry.store.R
import com.nerostarx.strawberry.store.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {

    private val viewModel: RegisterViewModel by activityViewModels()
    private lateinit var binding: FragmentRegisterBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        binding = FragmentRegisterBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val navigator = requireActivity().findNavController(R.id.auth_nav_host)

        binding.goLoginButton.setOnClickListener {
            navigator.navigate(R.id.back_to_login_action)
        }

        binding.registerButton.setOnClickListener {
            navigator.navigate(R.id.to_confirm_action)
        }
    }

}