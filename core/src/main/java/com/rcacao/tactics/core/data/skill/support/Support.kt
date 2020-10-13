package com.rcacao.tactics.core.data.skill.support

import com.rcacao.tactics.core.data.skill.Skill

open class Support(
    override val id: SupportId,
    override val name: String,
    override val description: String,
    override val jp: Int
) : Skill