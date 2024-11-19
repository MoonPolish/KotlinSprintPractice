package org.example.lesson_4

const val ARMS_AND_ABS = 1
const val LEGS_AND_BACK = 0

fun main() {

    val days = 5
    val sequence = 2

    val everyOtherDay = days % sequence

    val hands = "Упражнения для рук:"
    val legs = "Упражнения для ног:"
    val back = "Упражнения для спины:"
    val abs = "Упражнения для пресса:"

    val maxLength = maxOf(hands.length, legs.length, back.length, abs.length)

    println("""
        ${hands.padEnd(maxLength)} ${ARMS_AND_ABS == everyOtherDay}
        ${legs.padEnd(maxLength)} ${LEGS_AND_BACK == everyOtherDay}
        ${back.padEnd(maxLength)} ${LEGS_AND_BACK == everyOtherDay}
        ${abs.padEnd(maxLength)} ${ARMS_AND_ABS == everyOtherDay}
    """.trimIndent())

}