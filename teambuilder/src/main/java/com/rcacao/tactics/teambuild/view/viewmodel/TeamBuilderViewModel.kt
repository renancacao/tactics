package com.rcacao.tactics.teambuild.view.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rcacao.tactics.core.data.Result
import com.rcacao.tactics.core.data.soldier.model.Soldier
import com.rcacao.tactics.teambuild.domain.soldier.AddNewSoldierUseCase
import com.rcacao.tactics.teambuild.domain.soldier.GetSavedSoldiersUseCase
import com.rcacao.tactics.teambuild.view.ui.mapper.UiSoldierMapper
import com.rcacao.tactics.teambuild.view.ui.model.TeamBuilderViewState
import com.rcacao.tactics.teambuild.view.ui.model.UiSoldier
import kotlinx.coroutines.launch
import javax.inject.Inject

class TeamBuilderViewModel @ViewModelInject @Inject constructor(
    private val getSavedSoldiers: GetSavedSoldiersUseCase,
    private val addNewSoldierUseCase: AddNewSoldierUseCase,
    private val mapper: UiSoldierMapper
) : ViewModel() {

    private val _uiState = MutableLiveData<TeamBuilderViewState>()
    val uiState: LiveData<TeamBuilderViewState>
        get() = _uiState

    init {
        viewModelScope.launch {
            when (val result: Result<List<Soldier>> = getSavedSoldiers()) {
                is Result.Success -> _uiState.value =
                    TeamBuilderViewState.SoldiersLoad(map(result.data))
            }
        }
    }

    fun newSoldier() {
        viewModelScope.launch {
            when (val result: Result<List<Soldier>> = addNewSoldierUseCase()) {
                is Result.Success -> _uiState.value =
                    TeamBuilderViewState.SoldiersLoad(map(result.data))
            }
        }
    }

    private fun map(soldiers: List<Soldier>): List<UiSoldier> = mapper.map(soldiers)

}