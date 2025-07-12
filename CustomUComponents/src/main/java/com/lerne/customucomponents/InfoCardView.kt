package com.lerne.customucomponents

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.lerne.customucomponents.databinding.ViewInfoCardBinding

class InfoCardView (context: Context, attributeSet: AttributeSet? = null) : FrameLayout(context, attributeSet) {

    private val binding: ViewInfoCardBinding = ViewInfoCardBinding.inflate(LayoutInflater.from(context), this, true)

//    init {
//        val inflater = LayoutInflater.from(context)
//
//        binding = ViewInfoCardBinding.inflate(inflater, this, true)
//    }


    fun setData ( titulo: String, descripcion: String) {
        binding.titulo = titulo
        binding.descripcion = descripcion
    }
}