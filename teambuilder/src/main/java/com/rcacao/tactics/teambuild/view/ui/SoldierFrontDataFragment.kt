package com.rcacao.tactics.teambuild.view.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.rcacao.tactics.teambuild.databinding.FragmentSoldierFrontDataBinding
import com.rcacao.tactics.teambuild.view.viewmodel.TeamBuilderViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SoldierFrontDataFragment : Fragment() {

    private val viewModel: TeamBuilderViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentSoldierFrontDataBinding = FragmentSoldierFrontDataBinding.inflate(
            inflater,
            container,
            false
        )

        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewmodel = viewModel
        binding.executePendingBindings()
        return binding.root
    }

}