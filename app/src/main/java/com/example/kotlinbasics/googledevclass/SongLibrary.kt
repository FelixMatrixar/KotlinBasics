package com.example.kotlinbasics.googledevclass
fun main() {
    val brunoSong = Song("We Don't Talk About Bruno", "Encanto Cast", 2022, 1_000_000)
    brunoSong.printSongDec()
    println(brunoSong.isPopular)
}

/*

Create a class that can represent the structure of a song. The Song class must include
these code elements:

Properties for the title, artist, year published, and play count
A property that indicates whether the song is popular. If the play count is less than 1,000,
consider it unpopular.
A method that prints a song description in this format:
"[Title], performed by [artist], was released in [year published]."

 */

class Song(val title: String, val artist: String, val year: Int, val playCount: Int) {

    val isPopular = playCount >= 1000


        fun printSongDec() {
            println("$title, performed by $artist, was released in $year.")
        }
    }
