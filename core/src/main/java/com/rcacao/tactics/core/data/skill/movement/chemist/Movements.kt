package com.rcacao.tactics.core.data.skill.movement.chemist

import com.rcacao.tactics.core.data.skill.movement.Movement
import com.rcacao.tactics.core.data.skill.movement.MovementId

object TreasureHunter : Movement(
    MovementId.TREASURE_HUNTER,
    "Treasure Hunter",
    "Discover items hidden on tiles upon moving to them.",
    100
)
