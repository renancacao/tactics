package com.rcacao.tactics.teambuild.view.ui

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.rcacao.tactics.teambuild.R
import com.rcacao.tactics.teambuild.view.viewmodel.TeamBuilderViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TeamBuilderActivity : FullScreenActivity() {

    private val viewModel: TeamBuilderViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team_builder)
        initViewModelObserver()
    }

    private fun initViewModelObserver() {
        viewModel.event.observe(this, Observer { event ->
            event.getContentIfNotHandled()?.let {
                Toast.makeText(this, it, Toast.LENGTH_LONG).show()
            }
        })
    }
}
