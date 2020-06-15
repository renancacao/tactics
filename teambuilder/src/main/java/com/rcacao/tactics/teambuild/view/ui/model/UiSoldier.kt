package com.rcacao.tactics.teambuild.view.ui.model

class UiSoldier {

    val type: UiSoldierType
    var id: Int? = -1
    var hp: Int = -1
    var mp: Int = -1
    var br: Int = -1
    var fa: Int = -1
    var sprite: Int = -1

    constructor() {
        type = UiSoldierType.ADD_NEW
    }

    constructor(id: Int?, hp: Int, mp: Int, br: Int, fa: Int, sprite: Int) {
        type = UiSoldierType.SOLDIER
        this.id = id
        this.hp = hp
        this.mp = mp
        this.br = br
        this.fa = fa
        this.sprite = sprite
    }
}