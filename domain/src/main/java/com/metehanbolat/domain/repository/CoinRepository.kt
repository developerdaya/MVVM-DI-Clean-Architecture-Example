package com.metehanbolat.domain.repository

import com.metehanbolat.domain.model.Coin
import com.metehanbolat.domain.model.MyCountry1

interface CoinRepository {
    suspend fun getCoins(): List<Coin>
    suspend fun getCountry(): List<MyCountry1>
}