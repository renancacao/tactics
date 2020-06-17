package com.rcacao.tactics.teambuild.view.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rcacao.tactics.teambuild.R
import com.rcacao.tactics.teambuild.view.ui.model.UiSoldier
import com.rcacao.tactics.teambuild.view.ui.model.UiSoldierType
import com.rcacao.tactics.teambuild.view.viewmodel.TeamBuilderViewModel

class SoldierAdapter(private val viewModel: TeamBuilderViewModel) :
    RecyclerView.Adapter<SoldierAdapterViewHolder>() {

    var selectedSoldier: UiSoldier? = null
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    var soldiers: List<UiSoldier> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SoldierAdapterViewHolder {
        return when (viewType) {
            UiSoldierType.SOLDIER.ordinal -> createSoldierViewHolder(parent)
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

    override fun getItemViewType(position: Int): Int {
        return soldiers[position].type.ordinal
    }

    override fun getItemCount(): Int = soldiers.size

    override fun onBindViewHolder(holder: SoldierAdapterViewHolder, position: Int) =
        if (holder is SoldierViewHolder) {
            bindSoldierViewHolder(position, holder)
        } else {
            holder.itemView.setOnClickListener { viewModel.newSoldier() }
        }

    private fun bindSoldierViewHolder(position: Int, holder: SoldierViewHolder) {
        val soldier: UiSoldier = soldiers[position]
        val selected = soldier.id == selectedSoldier?.id
        holder.bind(soldier, selected, onItemClick())
    }

    private fun onItemClick(): (UiSoldier) -> Unit {
        return { uiSoldier: UiSoldier -> viewModel.selectSoldier(uiSoldier) }
    }

}
