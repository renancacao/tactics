package com.rcacao.tactics.teambuild.view.ui.databinding

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.rcacao.tactics.teambuild.R
import com.rcacao.tactics.teambuild.view.model.UiSoldier

@BindingAdapter("app:showIfExists")
fun showIfExists(view: View, soldier: UiSoldier?) {
    if (soldier == null) {
        view.visibility = View.GONE
    } else {
        setVisible(view)
    }
}

fun setVisible(view: View) {
    if (view.visibility != View.VISIBLE) {
        view.apply {
            alpha = 0f
            visibility = View.VISIBLE
            animate()
                .alpha(1f)
                .setDuration(200)
                .setListener(null)
        }
    }
}

@BindingAdapter("app:imageRes")
fun imageRes(view: ImageView, resId: Int) {
    view.setImageResource(resId)
}

@BindingAdapter("app:isSelected")
fun isSelected(view: View, isSelected: Boolean) {
    val color: Int = if (isSelected) R.color.selectedItemBackColor else R.color.itemBackColor
    view.setBackgroundResource(color)
}