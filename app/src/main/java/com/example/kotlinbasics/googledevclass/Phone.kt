package com.example.kotlinbasics.googledevclass

/*
Typically, a phone screen turns on and off when the power button is pressed. In contrast,
if a foldable phone is folded, the main inner screen on a foldable phone doesn't turn on when the power button is pressed.

In the initial code provided in the following code snippet, write a FoldablePhone class that inherits from the Phone class. It should contain the following:

A property that indicates whether the phone is folded.
A different switchOn() function behavior than the Phone class so that it only turns the screen on when the phone isn't folded.
Methods to change the folding state.
 */

open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) {
            "ON"
        } else {"OFF"}
        println("The phone screen's light is $phoneScreenLight.")
    }
}