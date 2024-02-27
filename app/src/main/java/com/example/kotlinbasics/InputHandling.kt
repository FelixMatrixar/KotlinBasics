package com.example.kotlinbasics


fun main () {

//    var count = 0
//    while (count < 3){
//        println(count)
//        count++
//
//
//    }
//    println("Loop is done")

    // Step 1: Prompt User for Input
    println("Please enter a number : ")

    // Step 2: Read User Input
    var inputString = readln()

    // Step 3: Convert String to Integer
    var inputNumber = inputString.toInt()

    // Step 4: Perform Arithmetic Operation
    val multiplier = 5

    var multiplication = multiplier * inputNumber
    println("Result of operation is: $multiplication" )


    // While Loop

    var userInput = "1"
    while (userInput == "1") {
        println("Loop executed")
        userInput = readln()
    }
}