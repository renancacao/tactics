package com.rcacao.tactics.core.data.damage

sealed class DamageFormula {
    data class PAVsRandom(val min: Int, val max: Int) : DamageFormula()
    object Nothing : DamageFormula()
}