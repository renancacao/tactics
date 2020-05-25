package com.rcacao.tactics.core.data.skill.action

sealed class VerticalRange {
    object None: VerticalRange()
    object Item: VerticalRange()
    object Weapon : VerticalRange()
    data class Value(val diff: Int): VerticalRange()
}
