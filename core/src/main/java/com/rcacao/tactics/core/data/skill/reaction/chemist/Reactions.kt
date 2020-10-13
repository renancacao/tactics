package com.rcacao.tactics.core.data.skill.reaction.chemist

import com.rcacao.tactics.core.data.skill.reaction.Reaction
import com.rcacao.tactics.core.data.skill.reaction.ReactionId
import com.rcacao.tactics.core.data.skill.reaction.ReactionTrigger

object AutoPotion : Reaction(
    id = ReactionId.AUTO_POTION,
    name = "Auto Potion",
    description = "Use a Potion to restore HP.",
    jp = 400,
    reactionTrigger = ReactionTrigger.HP_LOSS
)