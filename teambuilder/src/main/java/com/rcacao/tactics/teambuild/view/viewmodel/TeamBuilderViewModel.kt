package com.rcacao.tactics.teambuild.view.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rcacao.tactics.core.data.soldier.model.Soldier
import com.rcacao.tactics.teambuild.domain.soldier.GetSavedSoldiersUseCase
import com.rcacao.tactics.teambuild.domain.soldier.RandomBaseSoldierUseCase
import com.rcacao.tactics.teambuild.view.ui.model.SoldiersUiModel
import kotlinx.coroutines.launch

class TeamBuilderViewModel(
    val getSavedSoldiers: GetSavedSoldiersUseCase,
    val randomBaseSoldier: RandomBaseSoldierUseCase
) : ViewModel() {

    private val _uiState = MutableLiveData<SoldiersUiModel>()
    val uiState: LiveData<SoldiersUiModel>
        get() = _uiState

    private var soldiers: List<Soldier> = ArrayList()

    init {
        viewModelScope.launch {
            val result =
        }
    }

    fun newSoldier() {

    }

}