package com.example.kotlinbasics

fun main () {

    // Step 1: Creating a Mutable List of Fruits

    val fruitsList = mutableListOf("Apple", "Orange", "Pear", "Dragon Fruit", "Durian")
    println(fruitsList)

    // Step 2: Adding a New Fruit to the List

    fruitsList.add("Pineapple")
    println(fruitsList)

    // Step 3: Removing a Fruit from the List

    fruitsList.remove("Pear")
    println(fruitsList)

    // Step 4: Checking if a Specific Fruit is in the List

    var checkFruit = fruitsList.contains("Apple")
    if (checkFruit) {
        println("Yes")
    } else println("No")



}