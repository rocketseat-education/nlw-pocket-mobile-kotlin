package com.rocketseat.nlw.nearby.ui.screen.market_details

import com.rocketseat.nlw.nearby.data.model.Rule

data class MarketDetailsUiState(
    val rules: List<Rule>? = null,
    val coupon: String? = null,
)
