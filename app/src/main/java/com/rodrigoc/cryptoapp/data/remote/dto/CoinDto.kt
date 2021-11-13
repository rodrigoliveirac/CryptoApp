package com.rodrigoc.cryptoapp.data.remote.dto

import com.rodrigoc.cryptoapp.domain.model.Coin
import kotlinx.serialization.SerialName

data class CoinDto(
    val id: String,
    @SerialName("is_active")
    val isActive: Boolean,
    @SerialName("is_New")
    val isNew: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String
)

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        isActive = isActive,
        name = name,
        rank = rank,
        symbol = symbol,
    )
}