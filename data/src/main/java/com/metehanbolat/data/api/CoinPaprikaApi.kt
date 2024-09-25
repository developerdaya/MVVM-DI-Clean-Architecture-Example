package com.metehanbolat.data.api

import com.metehanbolat.data.model.CoinModel
import com.metehanbolat.data.model.MyCountry
import com.metehanbolat.domain.model.MyCountry1
import retrofit2.http.GET

interface CoinPaprikaApi {
    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinModel>

        @GET("https://api.sampleapis.com/countries/countries")
    suspend fun getCountry(): List<MyCountry1>


}