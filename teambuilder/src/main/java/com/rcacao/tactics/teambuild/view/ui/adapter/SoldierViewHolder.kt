package com.rcacao.tactics.teambuild.view.ui.adapter

import android.view.View
import com.rcacao.tactics.teambuild.R
import com.rcacao.tactics.teambuild.view.ui.model.UiSoldier
import kotlinx.android.synthetic.main.item_soldier.view.*

class SoldierViewHolder(view: View) : SoldierAdapterViewHolder(view) {

    fun bind(
        soldier: UiSoldier,
        selected: Boolean,
        function: (UiSoldier) -> Unit
    ) {
        itemView.textCurrentHp.text = soldier.hp.toString()
        itemView.textCurrentMp.text = soldier.mp.toString()
        itemView.textCurrentBrave.text = soldier.br.toString()
        itemView.textCurrentFaith.text = soldier.fa.toString()
        itemView.imgChar.setImageResource(soldier.sprite)
        val color: Int = if (selected) R.color.selectedItemBackColor else R.color.itemBackColor
        itemView.setBackgroundResource(color)
        itemView.setOnClickListener { function(soldier) }
    }

}