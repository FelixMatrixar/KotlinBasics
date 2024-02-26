package com.example.kotlinbasics

fun main () {
    // Step 1: Basic Age Verification:
    println("Please enter your age as a whole number: ")
    var inputAge = readln()
    var age = inputAge.toInt()



    // if (age >= 18 )
    // Step 2: Incorporating "else if":
    // if (age >= 18 )
    // else if (age >= 40)

    // 4. Step 3: Adding an "else" Clause:
    // 5. Step 4: Combining Conditions:
    // 6. Step 5: Using Range Checks:

    if (age in 18..40) {
        println("You can enter the club.")
    }
    else if (age >= 40) {
        println("You cannot go into the club, please go home.")
    }

    else {
        println("Age not verified. Please contact support.")
    }

}