package org.example.lesson_4

const val ARMS_AND_ABS = false
const val LEGS_AND_BACK = true

fun main() {

    val numberDay = 5
    val isEven = numberDay % 2 == 0

    val hands = "Упражнения для рук:"
    val legs = "Упражнения для ног:"
    val back = "Упражнения для спины:"
    val abs = "Упражнения для пресса:"

    val maxLength = maxOf(hands.length, legs.length, back.length, abs.length)

    println(
        """
        ${hands.padEnd(maxLength)} ${ARMS_AND_ABS != !isEven}
        ${legs.padEnd(maxLength)} ${LEGS_AND_BACK == isEven}
        ${back.padEnd(maxLength)} ${LEGS_AND_BACK == isEven}
        ${abs.padEnd(maxLength)} ${ARMS_AND_ABS != !isEven}
    """.trimIndent()
    )

}