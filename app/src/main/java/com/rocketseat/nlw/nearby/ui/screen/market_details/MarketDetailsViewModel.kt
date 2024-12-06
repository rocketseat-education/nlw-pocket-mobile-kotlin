package com.rocketseat.nlw.nearby.ui.screen.market_details

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rocketseat.nlw.nearby.core.network.NearbyRemoteDataSource
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class MarketDetailsViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(MarketDetailsUiState())
    val uiState: StateFlow<MarketDetailsUiState> = _uiState.asStateFlow()

    fun onEvent(event: MarketDetailsUiEvent) {
        when (event) {
            is MarketDetailsUiEvent.OnFetchCoupon -> fetchCoupon(qrCodeContent = event.qrCodeContent)
            is MarketDetailsUiEvent.OnFetchRules -> fetchRules(marketId = event.marketId)
            MarketDetailsUiEvent.OnResetCoupon -> resetCoupon()
        }
    }

    private fun fetchCoupon(qrCodeContent: String) {
        viewModelScope.launch {
            NearbyRemoteDataSource.patchCoupon(marketId = qrCodeContent).fold(
                onSuccess = { coupon ->
                    _uiState.update { currentUiState ->
                        currentUiState.copy(
                            coupon = coupon.coupon
                        )
                    }
                },
                onFailure = {
                    _uiState.update { currentUiState ->
                        currentUiState.copy(
                            coupon = ""
                        )
                    }
                }
            )
        }
    }

    private fun fetchRules(marketId: String) {
        viewModelScope.launch {
            NearbyRemoteDataSource.getMarketDetails(marketId = marketId).fold(
                onSuccess = { marketDetails ->
                    _uiState.update { currentUiState ->
                        currentUiState.copy(
                            rules = marketDetails.rules
                        )
                    }
                },
                onFailure = {
                    _uiState.update { currentUiState ->
                        currentUiState.copy(
                            rules = emptyList()
                        )
                    }
                }
            )
        }
    }

    private fun resetCoupon() {
        _uiState.update { currentUiState ->
            currentUiState.copy(
                coupon = null
            )
        }
    }
}