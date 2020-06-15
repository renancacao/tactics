package com.rcacao.tactics.teambuild.view.ui.model

class UiSoldier {

    val type: UiSoldierType
    var id: Int? = -1
    var hp: Int = -1
    var sprite: Int = -1

    constructor() {
        type = UiSoldierType.ADD_NEW
    }

    constructor(id: Int?, hp: Int, sprite: Int) {
        type = UiSoldierType.SOLDIER
        this.id = id
        this.hp = hp
        this.sprite = sprite
    }
}