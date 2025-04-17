package org.example.lesson_19

enum class Fish(val fishName: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок");

    companion object {
        fun printFishes() {
            println("Вы можете добавить следующих рыб в свой аквариум:")
            values().forEach { fish ->
                println("- ${fish.fishName}")
            }
        }
    }
}

fun main() {
    println(Fish.printFishes())
}