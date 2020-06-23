package com.rcacao.tactics.teambuild.view.ui.model

class UiSoldier {

    val type: UiSoldierType
    var id: Long? = -1
    var hp: String = ""
    var mp: String = ""
    var br: String = ""
    var fa: String = ""
    var sprite: Int = -1

    constructor() {
        type = UiSoldierType.ADD_NEW
    }

    constructor(id: Long?, hp: Int, mp: Int, br: Int, fa: Int, sprite: Int) {
        type = UiSoldierType.SOLDIER
        this.id = id
        this.hp = hp.toString()
        this.mp = mp.toString()
        this.br = br.toString()
        this.fa = fa.toString()
        this.sprite = sprite
    }
}