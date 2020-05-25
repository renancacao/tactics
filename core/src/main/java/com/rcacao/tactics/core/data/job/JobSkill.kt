package com.rcacao.tactics.core.data.job

import com.rcacao.tactics.core.data.skill.action.Action
import com.rcacao.tactics.core.data.skill.movement.Movement
import com.rcacao.tactics.core.data.skill.reaction.Reaction
import com.rcacao.tactics.core.data.skill.support.Support

class JobSkill(
    val skillName: String,
    val skillDescription: String,
    val actions: List<Action> = emptyList(),
    val reactions: List<Reaction> = ArrayList(),
    val support: List<Support> = ArrayList(),
    val movement: List<Movement> = ArrayList(),
    val innate: List<Support> = ArrayList()
)
