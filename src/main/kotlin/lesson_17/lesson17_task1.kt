package org.example.lesson_17

class QuizElement(val question: String) {
    private var _answer: String? = null

    val answer: String?
        get() = _answer

    fun setAnswer(answer: String?) {
        this._answer = answer
    }
}

fun main() {
    val quizItem = QuizElement("В каком году отменили крепостное право?")
    println(quizItem.answer)

    quizItem.setAnswer("В 1861.")
    println(quizItem.answer)
}