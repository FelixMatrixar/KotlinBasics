package com.example.kotlinbasics.googledevclass

val solarSystem = listOf("A", "B", "C")

val solarSystemEdit = mutableListOf("A", "B", "C")

val solarSystemSet = mutableSetOf("A", "B", "C")

val solarSystemMap = mutableMapOf(
    "Mercury" to 0,
    "Venus" to 0,
    "Earth" to 1,
    "Mars" to 2,
    "Jupiter" to 79,
    "Saturn" to 82,
    "Uranus" to 27,
    "Neptune" to 14
)

fun main() {

    // LIST EXAMPLE //

//    println(solarSystem[0])
//    println("Size: ${solarSystem.size}")
//    println(solarSystem.get(1))
//    println(solarSystem.indexOf("C"))
//    println(solarSystem.indexOf("D"))
//
//    for (planet in solarSystem) {
//        println(planet)
//    }

//    solarSystemEdit.add(0, "-A")
//    solarSystemEdit.add("D")
//
//    for (planet in solarSystemEdit) {
//        println(planet)
//    }
//
//    solarSystemEdit.remove("A")
//    for (planet in solarSystemEdit) {
//        print(planet)
//    }
//
//    print(solarSystemEdit.contains("B"))
//    print(solarSystemEdit.contains("V"))


    // SET EXAMPLE //
//    solarSystemSet.add("D")
//    println(solarSystemSet.size)
//    println(solarSystemSet.contains("A"))
//    solarSystemSet.remove("A")
//    println(solarSystemSet.contains("A"))
//    println(solarSystemSet.size)
//    solarSystemSet.add("D")
//    println(solarSystemSet.size)

    // MAPS EXAMPLE //

    println(solarSystemMap.size)
    println(solarSystemMap["Venus"])
    println(solarSystemMap.get("A"))

    solarSystemMap.remove("Venus")
    println(solarSystemMap.size)

    println()
    println(solarSystemMap["Mars"])
    solarSystemMap["Mars"] = 20
    println(solarSystemMap["Mars"])

    println()
    println(solarSystemMap.size)
    solarSystemMap["Venus"] = 27
    println(solarSystemMap.size)
    println(solarSystemMap["Venus"])

}