package com.rodrigoc.cryptoapp.domain.repository

import com.rodrigoc.cryptoapp.data.remote.dto.CoinDetailDto
import com.rodrigoc.cryptoapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins() : List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}