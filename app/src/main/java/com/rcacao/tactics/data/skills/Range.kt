package com.rcacao.tactics.data.skills

sealed class Range() {
    object Self : Range()
    object Item : Range()
    object Weapon : Range()
    data class Value(val dist: Int) : Range()
}
