package org.example.lesson_4

fun main() {

    val numberDay = 5
    val isEven = numberDay % 2 == 0

    val hands = "Упражнения для рук: "
    val legs = "Упражнения для ног: "
    val back = "Упражнения для спины: "
    val abs = "Упражнения для пресса: "

    val maxLength = maxOf(hands.length, legs.length, back.length, abs.length)

    println(
        """
        ${hands.padEnd(maxLength)}${!isEven}
        ${legs.padEnd(maxLength)}${isEven}
        ${back.padEnd(maxLength)}${isEven}
        ${abs.padEnd(maxLength)}${!isEven}
    """.trimIndent()
    )

}