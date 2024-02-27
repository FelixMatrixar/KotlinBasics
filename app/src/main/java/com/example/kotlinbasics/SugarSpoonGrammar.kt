package com.example.kotlinbasics

fun main () {

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


    makeCoffee(sugarCount= sugarCount, name = name)
}

fun makeCoffee(sugarCount : Int, name : String){

    if (sugarCount == 1) {
        println("Coffee with 1 spoon of sugar for $name")
    }
    else if (sugarCount < 0) {
        println("Please enter valid value for $name")
    }
    else if (sugarCount == 0){
        println("Coffee without sugar for $name")
    }
    else println("Coffee with $sugarCount spoons of sugar for $name")

}