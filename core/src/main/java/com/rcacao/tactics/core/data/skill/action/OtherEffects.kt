package com.rcacao.tactics.core.data.skill.action


sealed class OtherEffects {
    data class Knockback(val successRate: Float) : OtherEffects()
    object Nothing : OtherEffects()
}

