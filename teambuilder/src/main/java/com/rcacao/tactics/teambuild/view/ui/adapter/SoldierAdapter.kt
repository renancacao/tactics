package com.rcacao.tactics.teambuild.view.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rcacao.tactics.teambuild.databinding.ItemAddBinding
import com.rcacao.tactics.teambuild.databinding.ItemSoldierBinding
import com.rcacao.tactics.teambuild.view.ui.model.SoldierListItem
import com.rcacao.tactics.teambuild.view.ui.model.UiSoldier
import com.rcacao.tactics.teambuild.view.viewmodel.TeamBuilderViewModel

class SoldierAdapter(private val viewModel: TeamBuilderViewModel) :
    RecyclerView.Adapter<SoldierAdapterViewHolder>() {

    private val soldierType: Int = 0
    private val addType: Int = 1

    var selectedId: Long? = null
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
        val binding: ItemAddBinding =
            ItemAddBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AddViewHolder(binding)
    }

    private fun createSoldierViewHolder(parent: ViewGroup): SoldierViewHolder {
        val binding: ItemSoldierBinding =
            ItemSoldierBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SoldierViewHolder(binding)
    }

    override fun getItemViewType(position: Int): Int = when (soldiers[position]) {
        is UiSoldier -> soldierType
        else -> addType
    }

    override fun getItemCount(): Int = soldiers.size

    override fun onBindViewHolder(holder: SoldierAdapterViewHolder, position: Int) {
        if (holder is SoldierViewHolder) {
            holder.binding.soldier = soldiers[position] as UiSoldier
            holder.binding.viewModel = viewModel
            holder.binding.selectedId = selectedId
        } else if (holder is AddViewHolder) {
            holder.binding.viewModel = viewModel
        }
    }

    override fun getItemId(position: Int): Long =
        when (val item: SoldierListItem = soldiers[position]) {
            is UiSoldier -> item.id ?: -1
            else -> -1
        }

}
