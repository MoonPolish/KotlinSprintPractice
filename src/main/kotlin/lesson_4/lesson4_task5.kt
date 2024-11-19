package org.example.lesson_4

const val IS_UNHARMED = true
const val MIN_NUM_OF_PEOPLE = 55
const val MAX_NUM_OF_PEOPLE = 70
const val BOXES_OF_PROVISIONS = 50
const val IS_FAVORABLE_WEATHER = true

fun main() {

    print("Корпус невредимый: ")
    val presenceOfDamage = readLine().toBoolean()

    print("Текущий состав экипажа: ")
    val crewComposition = readLine()?.toInt()
    val crewCompositionNull = (crewComposition ?: 0)


    print("Количество ящиков с провизией на борту: ")
    val boxesOfProvisions = readLine()?.toInt()
    val boxesOfProvisionsNull = (boxesOfProvisions ?: 0)

    print("Благоприятность метеоусловий: ")
    val isFavorableWeather = readLine().toBoolean()

    println(((presenceOfDamage == IS_UNHARMED) && (crewCompositionNull in MIN_NUM_OF_PEOPLE..MAX_NUM_OF_PEOPLE) &&
            (boxesOfProvisionsNull > BOXES_OF_PROVISIONS) && (isFavorableWeather == IS_FAVORABLE_WEATHER) ||
            (isFavorableWeather != IS_FAVORABLE_WEATHER)) ||
            ((crewCompositionNull == MAX_NUM_OF_PEOPLE) && (isFavorableWeather == IS_FAVORABLE_WEATHER) &&
            (boxesOfProvisionsNull >= BOXES_OF_PROVISIONS)))

}