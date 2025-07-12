package com.lerne.customucomponents

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.lerne.customucomponents.databinding.ViewRatingStartBinding

class RatingStartVew(context: Context, attributeSet: AttributeSet? = null) : FrameLayout(context, attributeSet){

    private val binding: ViewRatingStartBinding

    init {
        val inflater = LayoutInflater.from(context)
        binding = ViewRatingStartBinding.inflate(inflater, this, true)
    }

    var rating : Float
        get() = binding.ratingBar.rating
        set(value) {
            binding.rating = value
        }

//    fun setRating(rating: Float) {
//        binding.rating = rating
//    }
//
//    fun getRating(): Float {
//        return binding.rating
//    }

}