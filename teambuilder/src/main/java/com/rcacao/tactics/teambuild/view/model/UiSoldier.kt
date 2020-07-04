package com.rcacao.tactics.teambuild.view.model

import com.rcacao.tactics.teambuild.view.ui.model.SoldierListItem

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
    val zodiacSprite: Int,
    val move: String,
    val jump: String,
    val speed: String,
    val weaponPowerR: String,
    val weaponPowerREv: String,
    val weaponPowerL: String,
    val weaponPowerLEv: String,
    val pa: String,
    val ma: String,
    val pCEV: String,
    val pSEV: String,
    val pAEV: String,
    val mCEV: String,
    val mSEV: String,
    val mAEV: String

) : SoldierListItem()