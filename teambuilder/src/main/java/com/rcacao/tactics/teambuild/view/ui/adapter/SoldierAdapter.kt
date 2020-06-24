package com.rcacao.tactics.teambuild.view.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rcacao.tactics.teambuild.R
import com.rcacao.tactics.teambuild.view.ui.model.SoldierListItem
import com.rcacao.tactics.teambuild.view.ui.model.UiSoldier
import com.rcacao.tactics.teambuild.view.viewmodel.TeamBuilderViewModel

class SoldierAdapter(private val viewModel: TeamBuilderViewModel) :
    RecyclerView.Adapter<SoldierAdapterViewHolder>() {

    private val soldierType: Int = 0
    private val addType: Int = 1

    var selectedSoldier: UiSoldier? = null
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    var soldiers: List<SoldierListItem> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SoldierAdapterViewHolder {
        return when (viewType) {
            soldierType -> createSoldierViewHolder(parent)
            else -> createAddViewHolder(parent)
        }
    }

    private fun createAddViewHolder(parent: ViewGroup): AddViewHolder {
        val view =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_add, parent, false)
        return AddViewHolder(view)
    }

    private fun createSoldierViewHolder(parent: ViewGroup): SoldierViewHolder {
        val view =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_soldier, parent, false)
        return SoldierViewHolder(view)
    }

    override fun getItemViewType(position: Int): Int = when (soldiers[position]) {
        is UiSoldier -> soldierType
        else -> addType
    }

    override fun getItemCount(): Int = soldiers.size

    override fun onBindViewHolder(holder: SoldierAdapterViewHolder, position: Int) =
        if (holder is SoldierViewHolder) {
            bindSoldierViewHolder(holder, soldiers[position] as UiSoldier)
        } else {
            holder.itemView.setOnClickListener { viewModel.newSoldier() }
        }

    private fun bindSoldierViewHolder(
        holder: SoldierViewHolder,
        soldier: UiSoldier
    ) {
        val selected = soldier.id == selectedSoldier?.id
        holder.bind(soldier, selected, onItemClick())
    }

    private fun onItemClick(): (UiSoldier) -> Unit {
        return { uiSoldier: UiSoldier -> viewModel.selectSoldier(uiSoldier) }
    }

}
