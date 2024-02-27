package com.example.kotlinbasics

fun main () {
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