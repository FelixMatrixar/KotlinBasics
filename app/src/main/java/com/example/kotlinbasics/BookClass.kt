package com.example.kotlinbasics


// Step 1: Define the Book Class
// Step 2: Adding a Constructor with Default Values
class Book (var title : String = "Unknown", var author : String = "Anonymous", var yearPublished : Int = 2024 ) {

    init {
        println("$title, $author , $yearPublished")
    }
}