package com.rcacao.tactics.data.skills


sealed class OtherEffects {
    data class Knockback(val successRate: Float) : OtherEffects()
    object Nothing : OtherEffects()
}

