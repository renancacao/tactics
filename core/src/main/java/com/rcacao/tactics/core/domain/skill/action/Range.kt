package com.rcacao.tactics.core.domain.skill.action

sealed class Range() {
    object Self : Range()
    object Item : Range()
    object Weapon : Range()
    data class Value(val dist: Int) : Range()
}
