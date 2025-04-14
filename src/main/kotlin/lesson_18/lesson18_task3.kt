package org.example.lesson_18

interface Animal {
    val name: String
    fun eat(): String
    fun sleep(): String
}

abstract class Pet(name: String): Animal {
    override val name: String = name
    abstract fun getFoodType(): String
    override fun eat(): String = "$name -> ест ${getFoodType()}."
    override fun sleep(): String = "$name -> спит."
}

class Fox(name: String) : Pet(name) {
    override fun getFoodType(): String = "ягоды"
}

class Dog(name: String) : Pet(name) {
    override fun getFoodType(): String = "кости"
}

class Cat(name: String) : Pet(name) {
    override fun getFoodType(): String = "рыбу"
}

fun main() {
    val fox = Fox("Рыжик")
    val dog = Dog("Бульдог")
    val cat = Cat("Мурлыка")

    val pets: List<Animal> = listOf(fox, dog, cat)

    for (pet in pets)
        println(pet.eat())
}