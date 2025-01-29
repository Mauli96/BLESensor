package com.example.blesensor.data

data class TempHumidityResult(
    val temperature: Float,
    val humidity: Float,
    val connectionState: ConnectionState
)