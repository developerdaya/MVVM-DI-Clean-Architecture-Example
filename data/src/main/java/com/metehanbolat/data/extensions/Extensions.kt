package com.metehanbolat.data.extensions

import com.metehanbolat.data.model.CoinModel
import com.metehanbolat.data.model.MyCountry
import com.metehanbolat.domain.model.Coin
import com.metehanbolat.domain.model.MyCountry1

fun CoinModel.toCoin(): Coin {
    return Coin(
        id, isActive, name, rank, symbol
    )
}

fun MyCountry1.toCountry(): MyCountry1 {
    return MyCountry1(
        name
    )
}

