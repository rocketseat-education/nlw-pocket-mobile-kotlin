package com.rocketseat.nlw.nearby.data.model

import kotlinx.serialization.Serializable

@Serializable
data class MarketDetails(
    val id: String,
    val categoryId: String,
    val name: String,
    val description: String,
    val rules: List<Rule>,
    val coupons: Int,
    val latitude: Double,
    val longitude: Double,
    val address: String,
    val phone: String,
    val cover: String,
)