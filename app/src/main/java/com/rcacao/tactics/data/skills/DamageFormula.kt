package com.rcacao.tactics.data.skills

sealed class DamageFormula {
    data class PAVsRandom(val min: Int, val max: Int) : DamageFormula()
    object Nothing : DamageFormula()
}