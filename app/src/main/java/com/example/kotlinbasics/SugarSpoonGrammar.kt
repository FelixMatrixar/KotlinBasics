package com.example.kotlinbasics

data class CoffeeDetails(val sugarCount: Int, val name: String, val size: String, val creamAmount : Int)
fun main () {

    var chrisCoffee = CoffeeDetails(1,"Chris", "Medium", 1)
    makeCoffee(chrisCoffee)

    println("please enter value 1 : ")
    var num1Str = readln().toInt()
    println("please enter value 2 : ")
    var num2Str = readln().toInt()

    var myResult = add(number1 = num1Str, number2 = num2Str)

    println(myResult)

}

fun add (number1: Int, number2: Int) : Int {
    var result = number1 + number2
    println("The result of $number1 + $number2 is: $result")

    return result
}


fun askCoffeeDetails () {
    println("Welcome, What's your name")

    val name = readln()

    println ("Welcome $name, how many pieces of sugar do you want ?")

    val sugarCount = readln().toInt()


    // makeCoffee(sugarCount= sugarCount, name = name)
}

fun makeCoffee(coffeeDetails : CoffeeDetails){

    if (coffeeDetails.sugarCount == 1) {
        println("${coffeeDetails.size} size Coffee with 1 spoon of sugar & ${coffeeDetails.creamAmount} spoon of cream for ${coffeeDetails.name}")
    }
    else if (coffeeDetails.sugarCount < 0) {
        println("Please enter valid value for ${coffeeDetails.name}")
    }
    else if (coffeeDetails.sugarCount == 0){
        println("${coffeeDetails.size} size Coffee without sugar for ${coffeeDetails.name}")
    }
    else println("${coffeeDetails.size} size Coffee with ${coffeeDetails.sugarCount} spoons of sugar for ${coffeeDetails.name}")

}