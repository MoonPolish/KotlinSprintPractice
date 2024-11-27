package org.example.lesson_5

const val UNDERWEIGHT = 18.5
const val NORMAL = 25
const val EXCESS = 30

const val METER = 100

fun main() {

    print("Введите Ваш вес в кг: ")
    val weight = readln().toFloat()

    print("Введите Ваш рост в см: ")
    val height = readln().toFloat()/METER

    val bodyMassIndex = weight / (height * height)

    val resultText = if (bodyMassIndex < UNDERWEIGHT) "- У Вас недостаточная масса тела. ИМТ: "
    else if (bodyMassIndex >= UNDERWEIGHT && bodyMassIndex < NORMAL) "- У Вас нормальная масса тела. ИМТ: "
    else if (bodyMassIndex >= NORMAL && bodyMassIndex < EXCESS) "- У Вас избыточная масса тела. ИМТ: "
    else "- У Вас ожирение. ИМТ: "
    println(resultText + String.format("%.2f", bodyMassIndex).replace(',', '.'))
}