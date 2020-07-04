package com.rcacao.tactics.teambuild.view.ui.databinding

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.rcacao.tactics.teambuild.R
import com.rcacao.tactics.teambuild.view.model.UiSoldier

@BindingAdapter("showIfExists")
fun showIfExists(view: View, soldier: UiSoldier?) {
    if (soldier == null) {
        view.visibility = View.GONE
    } else {
        view.visibility = View.VISIBLE
    }
}

@BindingAdapter("imageRes")
fun imageRes(view: ImageView, resId: Int) {
    view.setImageResource(resId)
}

@BindingAdapter("isSelected")
fun isSelected(view: View, isSelected: Boolean) {
    val color: Int = if (isSelected) R.color.selectedItemBackColor else R.color.itemBackColor
    view.setBackgroundResource(color)
}

@BindingAdapter("isExpanded")
fun isExpanded(view: View, isExpanded: Boolean) {
    if (isExpanded) {
        view.visibility = View.VISIBLE
    } else {
        view.visibility = View.GONE
    }
}

@BindingAdapter("expandedIcon")
fun expandedIcon(view: ImageView, isExpanded: Boolean) {
    if (isExpanded) {
        view.setImageResource(R.drawable.ic_baseline_arrow_drop_down_24)
    } else {
        view.setImageResource(R.drawable.ic_baseline_arrow_drop_up_24)
    }
}