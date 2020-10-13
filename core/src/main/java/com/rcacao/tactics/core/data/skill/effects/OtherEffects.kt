package com.rcacao.tactics.core.data.skill.effects


sealed class OtherEffects {
    data class Knockback(val successRate: Float) : OtherEffects()
}

