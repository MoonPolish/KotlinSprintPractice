package org.example.lesson_18

open class Dice(val sides: Int) {
    open fun roll() = (1..sides).random()
}

class FourSidedDice : Dice(4)
class SixSidedDice : Dice(6)
class EightSidedDice : Dice(8)

fun main() {

    val fourSidedDice = FourSidedDice()
    val sixSidedDice = SixSidedDice()
    val eightSidedDice = EightSidedDice()

    val diceList = listOf(fourSidedDice, sixSidedDice, eightSidedDice)

    for (dice in diceList) {
        println("Результат броска ${dice.sides}-гранной кости: ${dice.roll()}")
    }
}