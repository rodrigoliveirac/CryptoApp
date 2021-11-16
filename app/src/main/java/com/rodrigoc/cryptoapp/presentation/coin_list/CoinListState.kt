package com.rodrigoc.cryptoapp.presentation.coin_list

import com.rodrigoc.cryptoapp.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coin: List<Coin> = emptyList(),
    val error: String = ""
)
