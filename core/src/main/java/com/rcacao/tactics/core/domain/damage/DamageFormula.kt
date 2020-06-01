package com.rcacao.tactics.core.domain.damage

sealed class DamageFormula {
    data class PAVsRandom(val min: Int, val max: Int) : DamageFormula()
    object Nothing : DamageFormula()
}