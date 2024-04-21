package com.example.kotlinbasics.googledevclass

fun main() {
    val fold = FoldablePhone()
    fold.switchOn()
    fold.checkPhoneScreenLight()
    fold.unfold()
    fold.switchOn()
    fold.checkPhoneScreenLight()
}
class FoldablePhone(var isPhoneFolded: Boolean = true): Phone() {


    override fun switchOn() {
        if (!isPhoneFolded) {
            isScreenLightOn = true
        }
    }

    fun folding() {
        isPhoneFolded = true
    }

    fun unfold() {
        isPhoneFolded = false
    }
}

//class FoldablePhone(var isFolded: Boolean = true): Phone() {
//    override fun switchOn() {
//        if (!isFolded) {
//            isScreenLightOn = true
//        }
//    }
//
//    fun fold() {
//        isFolded = true
//    }
//
//    fun unfold() {
//        isFolded = false
//    }
//}
//
//fun main() {
//    val newFoldablePhone = FoldablePhone()
//
//    newFoldablePhone.switchOn()
//    newFoldablePhone.checkPhoneScreenLight()
//    newFoldablePhone.unfold()
//    newFoldablePhone.switchOn()
//    newFoldablePhone.checkPhoneScreenLight()
//}