package org.example.lesson_20

class Gamer(val hasKey: Boolean)

val checkDoor: (Gamer) -> String = { gamer ->
    if (gamer.hasKey) {
        "Игрок открыл дверь"
    } else {
        "Дверь заперта"
    }
}

fun main() {
    val gamerWithKey = Gamer(true)
    val gamerWithoutKey = Gamer(false)

    println(checkDoor(gamerWithKey))
    println(checkDoor(gamerWithoutKey))
}