package com.denislav.nedev.random.word.generator.ui.binding

import android.view.View
import androidx.databinding.BindingAdapter

object AppBindingAdapter {

    @BindingAdapter("visibleGone")
    fun visibleGone(
        view: View,
        isVisible: Boolean
    ) {
        view.visibility = if (isVisible) View.VISIBLE else View.GONE
    }
}