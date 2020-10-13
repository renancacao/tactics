package com.rcacao.tactics.core.data.skill.reaction.squire

import com.rcacao.tactics.core.data.skill.reaction.Reaction
import com.rcacao.tactics.core.data.skill.reaction.ReactionId
import com.rcacao.tactics.core.data.skill.reaction.ReactionTrigger

object CounterTackle : Reaction(
    id = ReactionId.COUNTER_TACKLE,
    name = "Counter Tackle",
    description = "Counter attack with a tackle. (Rush)",
    jp = 180,
    reactionTrigger = ReactionTrigger.PHYSICAL_ATTACK
)