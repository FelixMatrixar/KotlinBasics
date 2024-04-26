package com.example.kotlinbasics.googledevclass

import java.lang.reflect.Array.get

fun durationOfEvent(minutes: Int): String {
    return if (minutes < 60) {
        "Short"
    } else "Long"
}
data class Event(val title: String, val description: String? = null, val daypart: Daypart, val durationInMinutes: Int,
                 //val durationOfEvent: String = durationOfEvent(durationInMinutes)
    )

enum class Daypart { MORNING, EVENING, AFTERNOON }

val Event.durationOfEvent: String
    get() = if (this.durationInMinutes < 60) {
    "Short"}
    else "Long"

fun main() {
    val event1 = Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0)
    val event2 = Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15)
    val event3 = Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30)
    val event4 = Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60)
    val event5 = Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10)
    val event6 = Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)

    val eventList = mutableListOf<Event>(event1, event2, event3, event4, event5, event6)

    val shortEvent = eventList.filter { it.durationInMinutes < 60 }
    // println("You have ${shortEvent.size} short events")

    val dayEvent = eventList.groupBy { it.daypart }
//    val morningEvent = dayEvent[Daypart.MORNING] ?: listOf()
//    val eveningEvent = dayEvent[Daypart.EVENING] ?: listOf()
//    val afternoonEvent = dayEvent[Daypart.AFTERNOON] ?: listOf()

    dayEvent.forEach{
        (daypart, event) -> println("$daypart : ${event.size} events")
    }

    val lastEvent = eventList.last()


    println("Last event of the day: ${lastEvent.title}")
    println("Duration of first event of the day: ${eventList[0].durationOfEvent}")




}