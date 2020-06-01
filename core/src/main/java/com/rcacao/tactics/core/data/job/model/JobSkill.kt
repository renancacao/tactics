package com.rcacao.tactics.core.data.job.model

import com.rcacao.tactics.core.data.skill.action.model.Action
import com.rcacao.tactics.core.data.skill.movement.model.Movement
import com.rcacao.tactics.core.data.skill.reaction.model.Reaction
import com.rcacao.tactics.core.data.skill.support.model.Support

class JobSkill(
    val skillName: String,
    val skillDescription: String,
    val actions: List<Action> = emptyList(),
    val reactions: List<Reaction> = ArrayList(),
    val support: List<Support> = ArrayList(),
    val movement: List<Movement> = ArrayList(),
    val innate: List<Support> = ArrayList()
)
