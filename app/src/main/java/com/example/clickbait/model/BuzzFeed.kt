package com.example.clickbait.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class BuzzFeed(
    @DrawableRes val image: Int,
    @StringRes val cardName: Int,
    @StringRes val text: Int,
    val time: String
)


