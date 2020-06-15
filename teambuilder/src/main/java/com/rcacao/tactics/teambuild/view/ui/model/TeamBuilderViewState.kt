package com.rcacao.tactics.teambuild.view.ui.model

sealed class TeamBuilderViewState {
    data class SoldiersLoad(val soldiers: List<UiSoldier>) : TeamBuilderViewState()
}
