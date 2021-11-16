package com.rodrigoc.cryptoapp.data.repository

import com.rodrigoc.cryptoapp.data.remote.CoinPaprikaApi
import com.rodrigoc.cryptoapp.data.remote.dto.CoinDetailDto
import com.rodrigoc.cryptoapp.data.remote.dto.CoinDto
import com.rodrigoc.cryptoapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi,
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }

}