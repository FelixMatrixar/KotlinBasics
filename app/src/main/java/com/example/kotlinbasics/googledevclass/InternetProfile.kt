package com.example.kotlinbasics.googledevclass

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val count = scanner.nextInt()

    var sum = 0

    // TODO: Read integers and calculate their sum
    println("Enter $count integers:")
    repeat(count) {
        sum += readLine()!!.toInt()
    }

    println(sum)
}


class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {

    fun showProfile() {
        // Fill in code
        println("Name: $name")
        println("Age: $age")
        if (hobby != null) {
        print("Likes to $hobby ")}
        if (referrer != null){
            print("Has a referrer named ${referrer.name}, who likes to ${referrer.hobby}.")
        } else {
            print("Doesn't have a referrer.")
        }
        println("")
    }
}

/*
Name: Amanda
Age: 33
Likes to play tennis. Doesn't have a referrer.

Name: Atiqah
Age: 28
Likes to climb. Has a referrer named Amanda, who likes to play tennis.
 */