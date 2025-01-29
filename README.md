# BLE Scanner & Data Viewer

## Overview
The **BLE Scanner & Data Viewer** is an Android application built using **Kotlin and Jetpack Compose** that enables users to **scan, connect, and retrieve data from Bluetooth Low Energy (BLE) devices**. The app is designed to work with **temperature and humidity sensors** that communicate via BLE.

## Features
- **Scan BLE Devices**: Discover nearby Bluetooth Low Energy (BLE) devices in real-time.
- **Connect to BLE Sensors**: Establish a secure connection with supported BLE temperature and humidity sensors.
- **Live Data Streaming**: Continuously receive and display real-time temperature and humidity data from the connected BLE device.
- **User-Friendly UI**: A clean and intuitive interface built using Jetpack Compose.
- **Device Filtering**: Scan results can be filtered based on specific device names or services.
- **Connection Management**: Handle connection state changes (connected, disconnected, reconnecting).
- **Background Data Handling**: Ensure smooth data retrieval even when the app is running in the background.

## Tech Stack
- **Android (Kotlin, Jetpack Compose)** – UI and app logic
- **Bluetooth Low Energy (BLE API)** – Device scanning and communication
- **ViewModel + StateFlow** – Data management and UI updates
- **Hilt** – Dependency Injection
- **LiveData/Flow** – Observing BLE data updates

## Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/Mauli96/BLESensor.git
   ```
2. Open the project in **Android Studio**.
3. Sync the Gradle dependencies.
4. Run the app on a physical device (BLE functionality may not work on an emulator).

## Usage
1. **Grant Bluetooth permissions** when prompted.
2. Click the **Scan** button to discover nearby BLE devices.
3. Select a device from the list to establish a connection.
4. View real-time **temperature and humidity data** on the app interface.
5. Disconnect when done or allow background monitoring.
