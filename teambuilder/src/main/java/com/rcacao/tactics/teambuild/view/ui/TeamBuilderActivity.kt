package com.rcacao.tactics.teambuild.view.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.rcacao.tactics.teambuild.R
import com.rcacao.tactics.teambuild.view.ui.model.TeamBuilderViewState
import com.rcacao.tactics.teambuild.view.viewmodel.TeamBuilderViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_team_builder.*

@AndroidEntryPoint
class TeamBuilderActivity : FullScreenActivity() {

    private val viewModel: TeamBuilderViewModel by viewModels()

    private lateinit var soldierAdapter: SoldierAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team_builder)

        soldierAdapter = SoldierAdapter(viewModel)
        soldierRecyclerView.layoutManager = GridLayoutManager(this, 3)
        soldierRecyclerView.adapter = soldierAdapter

        initViewModelObserver()
    }

    private fun initViewModelObserver() {
        viewModel.uiState.observe(this, Observer {
            when (it) {
                is TeamBuilderViewState.SoldiersLoad -> soldierAdapter.uiSoldiers = it.soldiers
            }
        })
    }

}
