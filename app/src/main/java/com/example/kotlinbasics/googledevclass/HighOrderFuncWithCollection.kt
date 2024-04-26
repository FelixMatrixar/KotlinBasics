package com.example.kotlinbasics.googledevclass

class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

val cookies = listOf(
    Cookie(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana Walnut",
        softBaked = true,
        hasFilling = false,
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)

fun main() {

    cookies.forEach {
        println("Menu : ${it.name}")
    }

    val fullMenu = cookies.map {
        "${it.name} - ${it.price}"
    }

    fullMenu.forEach {
        println(it)
    }

    var softCookie = cookies.filter { it.softBaked }
    softCookie.forEach {
        println("${it.name} ${it.price}")
    }

    val groupedMenu = cookies.groupBy { it.softBaked }

    val softCookies = groupedMenu[true] ?: listOf()
    val hardCookies = groupedMenu[false] ?: listOf()

    println("GROUP")

    softCookies.forEach {
        println(it.name)
    }

    hardCookies.forEach {
        println(it.name)
    }

    var foldCookies = cookies.fold(0.00)  {
        total,cookie -> total + cookie.price
    }

    println(foldCookies)

    val alphaCookie = cookies.sortedBy { it.name }

    alphaCookie.forEach {
        println(it.name)
    }

}