package com.lerne.customucomponents

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.lerne.customucomponents.databinding.ViewCustomTitleBinding

class CustomTitleView(context: Context, attributeSet: AttributeSet? = null) :
    FrameLayout(context, attributeSet) {

    private val binding: ViewCustomTitleBinding

    init {
        val inflater = LayoutInflater.from(context)
        binding = ViewCustomTitleBinding.inflate(inflater, this, true)
    }

    fun setTitle(title: String) {
        binding.titulo = title
    }
}