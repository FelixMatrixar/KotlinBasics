package com.example.kotlinbasics

fun main () {

    // Step 1: Create a Mutable List of Integers

    val numbers = mutableListOf(1, 2, 3, 4, 5)

    // Step 2: Loop Through the List

    for(index in 0..< numbers.size) {

        // Step 3: Double Each Number
        numbers[index] = numbers[index] * 2





    }
    // Step 4: Print the Modified List
    println(numbers)

}