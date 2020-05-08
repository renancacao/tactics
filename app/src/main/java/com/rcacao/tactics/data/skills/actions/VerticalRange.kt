package com.rcacao.tactics.data.skills.actions

sealed class VerticalRange {
    object None: VerticalRange()
    object Item: VerticalRange()
    object Weapon : VerticalRange()
    data class Value(val diff: Int): VerticalRange()
}
