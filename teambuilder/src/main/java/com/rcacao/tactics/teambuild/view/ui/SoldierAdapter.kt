package com.rcacao.tactics.teambuild.view.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rcacao.tactics.teambuild.R
import com.rcacao.tactics.teambuild.view.ui.model.UiSoldier
import com.rcacao.tactics.teambuild.view.ui.model.UiSoldierType
import com.rcacao.tactics.teambuild.view.viewmodel.TeamBuilderViewModel
import kotlinx.android.synthetic.main.item_team_builder.view.*

class SoldierAdapter(private val viewModel: TeamBuilderViewModel) :
    RecyclerView.Adapter<SoldierAdapter.SoldierAdapterViewHolder>() {

    var uiSoldiers: List<UiSoldier> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    open class SoldierAdapterViewHolder(view: View) : RecyclerView.ViewHolder(view)
    class AddViewHolder(view: View) : SoldierAdapterViewHolder(view)
    class SoldierViewHolder(view: View) : SoldierAdapterViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SoldierAdapterViewHolder {
        return when (viewType) {
            UiSoldierType.SOLDIER.ordinal -> createSoldierViewModel(parent)
            else -> createAddViewHolder(parent)
        }
    }

    private fun createAddViewHolder(parent: ViewGroup): AddViewHolder {
        val view =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.add_team_builder, parent, false)
        return AddViewHolder(view)
    }

    private fun createSoldierViewModel(parent: ViewGroup): SoldierViewHolder {
        val view =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_team_builder, parent, false)
        return SoldierViewHolder(view)
    }

    override fun getItemViewType(position: Int): Int {
        return uiSoldiers[position].type.ordinal
    }

    override fun getItemCount(): Int = uiSoldiers.size

    private fun bindSoldierViewHolder(itemView: View, uiSoldier: UiSoldier) {
        itemView.textCurrentHp.text = uiSoldier.hp.toString()
        itemView.textCurrentMp.text = uiSoldier.mp.toString()
        itemView.textCurrentBrave.text = uiSoldier.br.toString()
        itemView.textCurrentFaith.text = uiSoldier.fa.toString()
        itemView.imgChar.setImageResource(uiSoldier.sprite)
    }

    override fun onBindViewHolder(holder: SoldierAdapterViewHolder, position: Int) {
        val uiSoldier: UiSoldier = uiSoldiers[position]
        if (holder is SoldierViewHolder) {
            bindSoldierViewHolder(holder.itemView, uiSoldier)
        } else {
            holder.itemView.setOnClickListener { viewModel.newSoldier() }
        }
    }
}
