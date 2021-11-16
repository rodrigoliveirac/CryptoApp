package com.rodrigoc.cryptoapp.domain.use_case.get_coin

import com.rodrigoc.cryptoapp.common.Resource
import com.rodrigoc.cryptoapp.data.remote.dto.toCoin
import com.rodrigoc.cryptoapp.data.remote.dto.toCoinDetail
import com.rodrigoc.cryptoapp.domain.model.Coin
import com.rodrigoc.cryptoapp.domain.model.CoinDetail
import com.rodrigoc.cryptoapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository,
) {
    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading())
            val coin = repository.getCoinById(coinId = coinId).toCoinDetail()
            emit(Resource.Success(coin))
        } catch (e: HttpException) {
             emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
        } catch (e: IOException) {
             emit(Resource.Error("Couldn't reach server. Check your internet connection."))
        }
    }
}