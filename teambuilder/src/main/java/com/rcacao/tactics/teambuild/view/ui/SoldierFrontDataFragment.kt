package com.rcacao.tactics.teambuild.view.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.rcacao.tactics.teambuild.R
import com.rcacao.tactics.teambuild.view.viewmodel.TeamBuilderViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SoldierFrontDataFragment : Fragment() {

    private val viewModel: TeamBuilderViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_soldier_front_data, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViewModelObserver()
    }

    private fun initViewModelObserver() {

    }

}