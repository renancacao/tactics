package com.rcacao.tactics.teambuild.view.ui.databinding

import android.view.View
import androidx.databinding.BindingAdapter
import com.rcacao.tactics.teambuild.view.ui.model.UiSoldier

@BindingAdapter("app:hideIfNull")
fun hideIfNull(view: View, soldier: UiSoldier?) {
    view.visibility = if (soldier == null) View.INVISIBLE else View.VISIBLE
}