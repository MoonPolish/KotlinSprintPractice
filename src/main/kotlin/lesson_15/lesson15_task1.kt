package org.example.lesson_15

interface Swimming {
    fun swim()
}

interface Flying {
    fun fly()
}

class Carp : Swimming {
    override fun swim() {
        println("Карась плывёт.")
    }
}

class Seagull : Flying {
    override fun fly() {
        println("Чайка летит.")
    }
}

class Duck : Flying, Swimming {
    override fun fly() {
        println("Утка летит.")
    }

    override fun swim() {
        println("Утка плывёт.")
    }
}

fun main() {
    val carp = Carp()
    val  seagull = Seagull()
    val duck = Duck()

    carp.swim()
    seagull.fly()
    duck.fly()
    duck.swim()
}