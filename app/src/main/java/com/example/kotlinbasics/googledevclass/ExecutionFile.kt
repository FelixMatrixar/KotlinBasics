package com.example.kotlinbasics.googledevclass

fun main() {
    var smartDeviceTv: SmartTvDevice = SmartTvDevice("Android TV", "Entertainment")


    var smartDeviceLight: SmartLightDevice = SmartLightDevice("Google Light", "Utility")


    var smartHome: SmartHome = SmartHome(smartDeviceTv, smartDeviceLight)
    println(smartHome.deviceTurnOnCount)
    smartHome.turnOnLight()
    smartHome.turnOnTv()
    println(smartHome.deviceTurnOnCount)
    smartHome.turnOffTv()
    println(smartHome.deviceTurnOnCount)
    smartHome.increaseTvVolume()

}