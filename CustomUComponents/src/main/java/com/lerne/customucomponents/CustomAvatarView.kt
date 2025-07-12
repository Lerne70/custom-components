package com.lerne.customucomponents

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.bumptech.glide.Glide
import com.lerne.customucomponents.databinding.ViewAvatarImageBinding

class CustomAvatarView(context: Context, attrs: AttributeSet? = null): FrameLayout(context, attrs) {

    private val binding: ViewAvatarImageBinding

    init {
        val inflater = LayoutInflater.from(context)
        binding = ViewAvatarImageBinding.inflate(inflater, this, true)
    }

    var nombreUsuario: String?
        get() = binding.nombreUsuario
        set(value) {
            binding.nombreUsuario = value
        }

    var imagenUrl: String?
        get() = binding.imagenUrl
        set(value) {
            Glide.with(context)
                .load(value)
                .circleCrop()
                .placeholder(R.drawable.fluent_change_unit)
                .into(binding.ivAvatar)
            binding.imagenUrl = value
        }

}