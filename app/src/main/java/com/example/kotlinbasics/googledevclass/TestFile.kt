package com.example.kotlinbasics.googledevclass

//fun main() {
//    var a: Int = 0
//    var b: Int = 0
//    var c: Int = 0
//    var d: Int = 0
//    val userInput = readln().toInt()
//
//    repeat(userInput) {
//        var gradeInput = readln().toInt()
//        when (gradeInput) {
//            5 -> a++
//            4 -> b++
//            3 -> c++
//            2 -> d++
//        }}
//
//    print("$d $c $b $a ")
//    // put your code here
//}

//fun main() {
//
//    var larger: Int = 0
//    var smaller: Int = 0
//    var perfect: Int = 0
//
//    val userInput = readln().toInt()
//
//    repeat(userInput) {
//        var checkInput = readln().toInt()
//        when (checkInput) {
//            1 -> larger++
//            -1 -> smaller++
//            0 -> perfect++
//
//        }}
//
//    print("$perfect $larger $smaller ")
//
//}

fun findYears(depo: Double): Int{
    var deposit = depo
    val interestRate = 1.071
    val max = 700000
    var years = 0
    //
    // implement the while loop here
    do {
        deposit *= interestRate
        years ++
    } while (deposit < max)
    //
    return years
}

//fun main() {
//    val userInput = readln().toInt()
//    var number  = 1
//    var square = number * number
//
//    while (square <= userInput) {
//
//        println(square)
//
//        number ++
//
//        square = number * number
//    }
//    // put your code here


fun main() {
    // put your code here

    var input = readln().toInt()
    var i = 0
//    var number = 1
//    var a = 1
//
//    do {
//        print("$number ")
//        if (a < number) {
//            a++
//        } else {
//            number++
//            a = 1
//        }
//        i++
//    } while (
//        input >= i
//    )

    while (input > 0) {
        i++
        repeat(if (i > input) input else i) {
            print("$i ")
        }
        input -= i
    }

}

