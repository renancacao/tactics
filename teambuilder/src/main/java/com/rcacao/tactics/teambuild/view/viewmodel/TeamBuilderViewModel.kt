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
import com.rcacao.tactics.teambuild.view.model.UiSoldier
import com.rcacao.tactics.teambuild.view.ui.model.SoldierListItem
import com.rcacao.tactics.teambuild.view.viewmodel.mapper.UiSoldierMapper
import kotlinx.coroutines.launch
import javax.inject.Inject

open class TeamBuilderViewModel @ViewModelInject @Inject constructor(
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

    private val _selectedId = MutableLiveData<Long?>()
    val selectedId: LiveData<Long?>
        get() = _selectedId

    private val _event = MutableLiveData<Event<TeamBuilderUiEvent>>()
    val event: LiveData<Event<TeamBuilderUiEvent>>
        get() = _event

    private val _error = MutableLiveData<Event<String>>()
    val error: LiveData<Event<String>>
        get() = _error

    private val _expanded = MutableLiveData<Boolean>()
    val isExpanded: LiveData<Boolean>
        get() = _expanded

    init {
        listSoldiers()
        _expanded.value = false
    }

    private fun listSoldiers() {
        viewModelScope.launch {
            when (val result: Result<List<Soldier>> = getSavedSoldiers()) {
                is Result.Success -> {
                    _soldierList.value = mapper.map(result.data) as ArrayList<SoldierListItem>
                    dataUpdated()
                }
                is Result.Error -> _error.value = Event(result.exception.message ?: "error")
            }
        }
    }

    fun newSoldier() {
        viewModelScope.launch {
            when (val result: Result<Soldier> = addNewSoldierUseCase()) {
                is Result.Success -> {
                    selectNewSoldier(result.data)
                }
                is Result.Error -> _error.value = Event(result.exception.message ?: "error")
            }
        }
    }

    private fun selectNewSoldier(soldier: Soldier) {
        listSoldiers()
        selectSoldier(mapper.map(soldier))
    }

    fun selectSoldier(soldier: UiSoldier) {
        _selectedSoldier.value = soldier
        _selectedId.value = soldier.id
        dataUpdated()
    }

    fun changeExpansion() {
        val expanded: Boolean = _expanded.value ?: false
        _expanded.value = !expanded
    }

    private fun dataUpdated() {
        _event.value = Event(TeamBuilderUiEvent.UpdateSoldiers)
    }

}