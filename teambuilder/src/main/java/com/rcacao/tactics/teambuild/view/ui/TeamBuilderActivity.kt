package com.rcacao.tactics.teambuild.view.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.rcacao.tactics.teambuild.R
import com.rcacao.tactics.teambuild.view.viewmodel.TeamBuilderViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_team_builder.*

@AndroidEntryPoint
class TeamBuilderActivity : AppCompatActivity() {

    private val viewModel: TeamBuilderViewModel by viewModels()

    private val soldierAdapter = SoldierAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team_builder)

        soldierRecyclerView.layoutManager = GridLayoutManager(this, 4)
        soldierRecyclerView.adapter = soldierAdapter

        initViewModelObserver()
    }

    private fun initViewModelObserver() {
        viewModel.uiState.observe(this, Observer {
            soldierAdapter.soldiers = it.soldiers
        })
    }
}
