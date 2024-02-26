package com.example.kotlinbasics

fun main() {
    // Step 1: Declaring an Immutable Variable
    val constantNumber: Int = 42

    // Step 2: Declaring a Mutable Variable
    var mutableString: String = "Hello, Kotlin!"

    // Step 3: Printing Variables
    println("Constant Number: $constantNumber")
    println("Mutable String: $mutableString")

    // Step 4: Modifying and Reprinting Mutable Variable
    mutableString = "Modified String!"
    println("Modified Mutable String: $mutableString")
}
