package com.lerne.customucomponents

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import androidx.databinding.DataBindingUtil
import com.lerne.customucomponents.databinding.ViewCustomBottomActionsBinding

class CustomActionButtonsView(context: Context, attrs: AttributeSet ) : FrameLayout(context, attrs) {

    private val binding: ViewCustomBottomActionsBinding

    init {
        val inflater = LayoutInflater.from(context)
        binding = ViewCustomBottomActionsBinding.inflate(inflater, this, true)
    }

    fun addOptonOneClickListener(onClickListener: OnClickListener) {
        binding.onOptionOneClick = onClickListener
    }


}