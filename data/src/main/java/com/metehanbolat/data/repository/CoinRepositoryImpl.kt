package com.metehanbolat.data.repository

import com.metehanbolat.data.api.CoinPaprikaApi
import com.metehanbolat.data.extensions.toCoin
import com.metehanbolat.data.extensions.toCountry
import com.metehanbolat.data.model.MyCountry
import com.metehanbolat.domain.model.Coin
import com.metehanbolat.domain.model.MyCountry1
import com.metehanbolat.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
): CoinRepository{

    override suspend fun getCoins(): List<Coin> {
        return api.getCoins().map { it.toCoin() }
    }

    override suspend fun getCountry(): List<MyCountry1> {
        return api.getCountry().map { it.toCountry() }

    }

}