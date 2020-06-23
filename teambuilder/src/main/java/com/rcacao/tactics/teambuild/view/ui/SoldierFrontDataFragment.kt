package com.rcacao.tactics.teambuild.view.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.rcacao.tactics.teambuild.R
import com.rcacao.tactics.teambuild.databinding.FragmentSoldierFrontDataBinding
import com.rcacao.tactics.teambuild.view.viewmodel.TeamBuilderViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SoldierFrontDataFragment : Fragment() {

    private val viewModel: TeamBuilderViewModel by activityViewModels()
    private lateinit var binding: FragmentSoldierFrontDataBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_soldier_front_data,
            container,
            false
        )
        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewmodel = viewModel
        binding.executePendingBindings()
        return binding.root
    }

}