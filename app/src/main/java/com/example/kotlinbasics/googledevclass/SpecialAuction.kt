package com.example.kotlinbasics.googledevclass

fun main() {
    val winningBid = Bid(5000, "Private Collector")

    println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
    println("Item B is sold at ${auctionPrice(null, 3000)}.")
}

class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
//    val bid = bid?.amount ?: 0
//    val minimumPrice = minimumPrice
//    var winningBid = 0
//
//    if (minimumPrice < bid) {
//        winningBid = bid
//    } else {
//        winningBid = minimumPrice
//    }
//
//    return winningBid

    return bid?.amount ?: minimumPrice

}

/*
Complete the auctionPrice() function so that the program prints these lines:


Item A is sold at 5000.
Item B is sold at 3000.

 */