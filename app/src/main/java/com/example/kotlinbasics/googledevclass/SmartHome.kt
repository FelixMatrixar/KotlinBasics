package com.example.kotlinbasics.googledevclass

class SmartHome(
    val smartTvDevice: SmartTvDevice,
    val smartLightDevice: SmartLightDevice
) {

    var deviceTurnOnCount = 0
        private set(value) {
            if (value in 0..2) {
                field = value
            }
        }

    fun turnOnTv() {
        if(smartTvDevice.deviceStatus == "off") {
            deviceTurnOnCount++
            smartTvDevice.turnOn()}
        else {
            println("The TV has already turned on")}
    }

    fun turnOffTv() {
        if(smartTvDevice.deviceStatus == "on") {
            deviceTurnOnCount--
            smartTvDevice.turnOff()}
        else {
            println("The TV has already turned off")}
    }

    fun increaseTvVolume() {
        if (smartTvDevice.deviceStatus == "on") {
            smartTvDevice.increaseSpeakerVolume()}
        else {
            println("Device is turned off")}
    }
    fun decreaseTvVolume() {
        if (smartTvDevice.deviceStatus == "on") {
            smartTvDevice.decreaseSpeakerVolume()}
        else {
            println("Device is turned off")}
    }

    fun changeTvChannelToNext() {
        if (smartTvDevice.deviceStatus == "on") {
            smartTvDevice.nextChannel() }
        else {
            println("Device is turned off")}
    }

    fun changeTvChannelToPrevious() {
        if (smartTvDevice.deviceStatus == "on") {
            smartTvDevice.previousChannel()}
        else {
            println("Device is turned off")}
    }
    fun turnOnLight() {
        if(smartLightDevice.deviceStatus == "off") {
            deviceTurnOnCount++
            smartLightDevice.turnOn()}
        else {
            println("The light has already turned on")}
    }

    fun turnOffLight() {
        if(smartLightDevice.deviceStatus == "on") {
            deviceTurnOnCount--
            smartLightDevice.turnOff()}
        else {
            println("The light has already turned off")}
    }

    fun increaseLightBrightness() {
        if(smartLightDevice.deviceStatus == "on") {
            smartLightDevice.increaseBrightness()}
        else {
            println("The light not turned on yet")}
    }

    fun decreaseLightBrightness() {
        if(smartLightDevice.deviceStatus == "on") {
            smartLightDevice.decreaseBrightness()}
        else {
            println("The light not turned on yet")}
    }

    fun printSmartTVInfo() {
        smartTvDevice.printDeviceInfo()
    }

    fun printSmartLightInfo() {
        smartLightDevice.printDeviceInfo()
    }

    fun turnOffAllDevices() {
        turnOffTv()
        turnOffLight()
    }
}

// In the SmartHome class, ensure that all actions can only be performed when each device's deviceStatus property is set to an "on" string. Also, ensure that the deviceTurnOnCount property is updated correctly.