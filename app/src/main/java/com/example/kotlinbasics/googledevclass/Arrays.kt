package com.example.kotlinbasics.googledevclass

val planet = arrayOf("A", "B", "C")
val newPlanet = arrayOf ("D", "E", "F")

val allPlanet = planet + newPlanet

fun main() {
    println(allPlanet[0])

    allPlanet[0] = "ADA"

    println(allPlanet[0])
    println(allPlanet[1])


}