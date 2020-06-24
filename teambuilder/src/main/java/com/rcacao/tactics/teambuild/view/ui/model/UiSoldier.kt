package com.rcacao.tactics.teambuild.view.ui.model

class UiSoldier(
    val id: Long?,
    val name: String,
    val jobName: String,
    val hp: String,
    val mp: String,
    val br: String,
    val fa: String,
    val sprite: Int,
    val portrait: Int,
    val zodiacSprite: Int
) : SoldierListItem()