package com.example.kotlinbasics.googledevclass

enum class Difficulty {
    EASY, MEDIUM, HARD
}

data class Question<T>(

    val questionText: String,
    val answer: T,
    val difficulty: Difficulty

)

object StudentProgress {
    var total: Int = 10
    var answered: Int = 3
}

interface ProgressPrintable {
    val progressText: String
    fun printProgressBar()
}

class Quiz(): ProgressPrintable {

    var questionOne = Question<String>("Animal", "Dog", Difficulty.EASY)
    var questionTwo = Question<Boolean>("Animal", true, Difficulty.HARD)
    var questionThree = Question<Int>("Animal", 2, Difficulty.MEDIUM)

    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3 }

    override val progressText: String
        get() = "${answered} of ${total} answered"

    override fun printProgressBar() {
        repeat(Quiz.answered) {
            print("▓")
        }
        repeat(Quiz.total - Quiz.answered) {
            print("▒")
        }
        println()

        println(Quiz().progressText)
    }

    fun printQuestion() {
        questionOne.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
    }



}




fun main() {

    val quiz = Quiz()

    quiz.printQuestion()

    Quiz().apply {
        printQuestion()
    }


}