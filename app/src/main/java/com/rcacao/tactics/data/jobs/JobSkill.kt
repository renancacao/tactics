package com.rcacao.tactics.data.jobs

import com.rcacao.tactics.data.skills.Movement
import com.rcacao.tactics.data.skills.Reaction
import com.rcacao.tactics.data.skills.Support
import com.rcacao.tactics.data.skills.actions.Attack

abstract class JobSkill{

    val skillName = "Fundaments"
    val skillDescription =
        "Squire job command. These are the most fundamental of all battle techniques."

    val actions: ArrayList<Attack> = ArrayList()
    val reactions: ArrayList<Reaction> = ArrayList()
    val support: ArrayList<Support> = ArrayList()
    val movement: ArrayList<Movement> = ArrayList()
    val innate: ArrayList<Support> = ArrayList()


}