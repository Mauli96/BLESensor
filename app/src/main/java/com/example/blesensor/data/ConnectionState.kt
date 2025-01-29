package com.example.blesensor.data

sealed interface ConnectionState {
    data object Connected: ConnectionState
    data object Disconnected: ConnectionState
    data object Uninitialized: ConnectionState
    data object CurrentlyInitializing: ConnectionState
}