package com.rcacao.tactics.teambuild.view.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rcacao.tactics.core.data.Result
import com.rcacao.tactics.core.data.soldier.model.Soldier
import com.rcacao.tactics.core.domain.Event
import com.rcacao.tactics.teambuild.domain.soldier.AddNewSoldierUseCase
import com.rcacao.tactics.teambuild.domain.soldier.GetSavedSoldiersUseCase
import com.rcacao.tactics.teambuild.view.ui.mapper.UiSoldierMapper
import com.rcacao.tactics.teambuild.view.ui.model.SoldierListItem
import com.rcacao.tactics.teambuild.view.ui.model.UiSoldier
import kotlinx.coroutines.launch
import javax.inject.Inject

class TeamBuilderViewModel @ViewModelInject @Inject constructor(
    private val getSavedSoldiers: GetSavedSoldiersUseCase,
    private val addNewSoldierUseCase: AddNewSoldierUseCase,
    private val mapper: UiSoldierMapper
) : ViewModel() {

    private val _soldierList = MutableLiveData<List<SoldierListItem>>()
    val soldierList: LiveData<List<SoldierListItem>>
        get() = _soldierList

    private val _selectedSoldier = MutableLiveData<UiSoldier>()
    val selectedSoldier: LiveData<UiSoldier>
        get() = _selectedSoldier

    private val _event = MutableLiveData<Event<String>>()
    val event: LiveData<Event<String>>
        get() = _event

    init {
        listSoldiers()
    }

    private fun listSoldiers() {
        viewModelScope.launch {
            when (val result: Result<List<Soldier>> = getSavedSoldiers()) {
                is Result.Success ->
                    _soldierList.value = mapper.map(result.data) as ArrayList<SoldierListItem>
                is Result.Error -> _event.value = Event(result.exception.message ?: "error")
            }
        }
    }

    fun newSoldier() {
        viewModelScope.launch {
            when (val result: Result<Soldier> = addNewSoldierUseCase()) {
                is Result.Success -> {
                    _selectedSoldier.value = mapper.map(result.data)
                    listSoldiers()
                }
                is Result.Error -> _event.value = Event(result.exception.message ?: "error")
            }
        }
    }

    fun selectSoldier(soldier: UiSoldier) {
        _selectedSoldier.value = soldier
    }

}