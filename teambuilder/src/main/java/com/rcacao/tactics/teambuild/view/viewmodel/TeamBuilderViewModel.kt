package com.rcacao.tactics.teambuild.view.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rcacao.tactics.core.data.Result
import com.rcacao.tactics.core.data.soldier.model.Soldier
import com.rcacao.tactics.teambuild.domain.soldier.AddNewSoldierUseCase
import com.rcacao.tactics.teambuild.domain.soldier.GetSavedSoldiersUseCase
import com.rcacao.tactics.teambuild.view.ui.model.SoldiersUiModel
import kotlinx.coroutines.launch

class TeamBuilderViewModel(
    val getSavedSoldiers: GetSavedSoldiersUseCase,
    val addNewSoldierUseCase: AddNewSoldierUseCase
) : ViewModel() {

    private val _uiState = MutableLiveData<SoldiersUiModel>()
    val uiState: LiveData<SoldiersUiModel>
        get() = _uiState

    init {
        viewModelScope.launch {
            when (val result: Result<List<Soldier>> = getSavedSoldiers()) {
                is Result.Success -> _uiState.value = SoldiersUiModel(result.data)
            }
        }
    }

    fun newSoldier() {
        viewModelScope.launch {
            when (val result: Result<List<Soldier>> = addNewSoldierUseCase()) {
                is Result.Success -> _uiState.value = SoldiersUiModel(result.data)
            }
        }
    }

}