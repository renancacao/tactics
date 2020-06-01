package com.rcacao.tactics.teambuild.view.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rcacao.tactics.core.data.soldier.model.Soldier
import com.rcacao.tactics.teambuild.R
import kotlinx.android.synthetic.main.item_team_builder.view.*

class SoldierAdapter :
    RecyclerView.Adapter<SoldierAdapter.SoldierViewHolder>() {

    var soldiers: List<Soldier> = emptyList()

    class SoldierViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SoldierViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_team_builder, parent, false)
        view.imgChar.setImageResource(R.drawable.tb_squire_male)
        return SoldierViewHolder(view)
    }

    override fun getItemCount(): Int = soldiers.size

    override fun onBindViewHolder(holder: SoldierViewHolder, position: Int) {
        //todo
    }
}
