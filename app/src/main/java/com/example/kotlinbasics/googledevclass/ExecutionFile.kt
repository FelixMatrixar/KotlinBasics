package com.example.kotlinbasics.googledevclass

fun main() {
    var smartDeviceTv: SmartTvDevice = SmartTvDevice("Android TV", "Entertainment")


    var smartDeviceLight: SmartLightDevice = SmartLightDevice("Google Light", "Utility")


    var smartHome: SmartHome = SmartHome(smartDeviceTv, smartDeviceLight)


    smartDeviceTv.turnOn()
    smartDeviceTv.printDeviceInfo()
    smartDeviceLight.turnOn()
    smartDeviceLight.printDeviceInfo()

    smartHome.increaseTvVolume()
    smartHome.changeTvChannelToNext()
    smartHome.increaseLightBrightness()

    smartHome.decreaseTvVolume()
    smartHome.changeTvChannelToPrevious()
    smartHome.decreaseLightBrightness()

    smartHome.printSmartTVInfo()
    smartHome.printSmartLightInfo()

    smartHome.turnOffAllDevices()
    smartHome.turnOffAllDevices()

    smartHome.printSmartTVInfo()
    smartHome.printSmartLightInfo()

    smartHome.increaseTvVolume()
    smartHome.changeTvChannelToNext()
    smartHome.increaseLightBrightness()

    smartHome.decreaseTvVolume()
    smartHome.changeTvChannelToPrevious()
    smartHome.decreaseLightBrightness()

    smartHome.turnOnTv()
    smartHome.turnOnTv()
    smartHome.turnOnLight()
    smartHome.turnOnLight()

}