package com.example.clickbait.data

import com.example.clickbait.R
import com.example.clickbait.model.BuzzFeed


object DataSource {
    val buzzFeed = listOf(
        BuzzFeed(R.drawable.travel, R.string.Buzz_Feed, R.string.buzz_feed, "22m"),
        BuzzFeed(R.drawable.pet, R.string.Info_Frenzy_Hub, R.string.info_frenzy_hub, "1h"),
        BuzzFeed(R.drawable.fantasy, R.string.Viral_Insight_Globe, R.string.viral_insight_globe, "16h"),
        BuzzFeed(R.drawable.diy, R.string.Viral_Insight_Globe, R.string.viral_insight_globe2, "36m"),
        BuzzFeed(R.drawable.cartoons, R.string.Curiosity_Sphere, R.string.curiosity_sphere, "2d"),
        BuzzFeed(R.drawable.pizza, R.string.Info_Frenzy_Hub, R.string.info_frenzy_hub2, "42m"),
        BuzzFeed(R.drawable.celebrity, R.string.Trend_Unveil_Arena, R.string.trend_unveil_arena, "12m"),
        BuzzFeed(R.drawable.junkfood, R.string.Buzz_Feed, R.string.buzz_feed2, "2h"),
        BuzzFeed(R.drawable.soulmate, R.string.Curiosity_Sphere, R.string.curiosity_sphere2, "4h"),
        BuzzFeed(R.drawable.lifehacks, R.string.Huff_Post, R.string.huff_post, "51m")

    )
}