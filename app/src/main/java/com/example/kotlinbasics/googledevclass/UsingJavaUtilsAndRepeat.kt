package com.example.kotlinbasics.googledevclass

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val count = scanner.nextInt()

    var sum = 0

    // TODO: Read integers and calculate their sum
    repeat(count) {
        sum += scanner.nextInt()
    }

    println(sum)
}
