package com.rcacao.tactics.data.jobs

import com.rcacao.tactics.data.skills.actions.Action
import com.rcacao.tactics.data.skills.movement.Movement
import com.rcacao.tactics.data.skills.reactions.Reaction
import com.rcacao.tactics.data.skills.support.Support

class JobSkill(
    val skillName: String,
    val skillDescription: String,
    val actions: List<Action> = emptyList(),
    val reactions: List<Reaction> = ArrayList(),
    val support: List<Support> = ArrayList(),
    val movement: List<Movement> = ArrayList(),
    val innate: List<Support> = ArrayList()
)
