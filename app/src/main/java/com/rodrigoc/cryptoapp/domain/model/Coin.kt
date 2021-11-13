package com.rodrigoc.cryptoapp.domain.model

import kotlinx.serialization.SerialName

data class Coin(
    val id: String,
    val isActive: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
)
