package com.example.blesensor.presentation.temperature_humidity_screen

import android.bluetooth.BluetoothAdapter
import androidx.compose.runtime.Composable
import com.example.blesensor.presentation.permissions.SystemBroadcastReceiver

@Composable
fun TemperatureHumidityScreen(
    onBluetoothStateChanged: () -> Unit,
) {

    SystemBroadcastReceiver(systemAction = BluetoothAdapter.ACTION_STATE_CHANGED) { bluetoothState ->
        val action = bluetoothState?.action ?: return@SystemBroadcastReceiver
        if(action == BluetoothAdapter.ACTION_STATE_CHANGED) {
            onBluetoothStateChanged()
        }
    }
}