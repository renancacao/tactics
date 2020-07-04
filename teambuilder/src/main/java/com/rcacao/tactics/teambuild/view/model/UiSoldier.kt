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
    val move: Int,
    val jump: Int,
    val speed: Int,
    val weaponPowerR: Int,
    val weaponPowerREv: Int,
    val weaponPowerL: Int,
    val weaponPowerLEv: Int,
    val pa: Int,
    val ma: Int,
    val pCEV: Int,
    val pSEV: Int,
    val pAEV: Int,
    val mCEV: Int,
    val mSEV: Int,
    val mAEV: Int

) : SoldierListItem()