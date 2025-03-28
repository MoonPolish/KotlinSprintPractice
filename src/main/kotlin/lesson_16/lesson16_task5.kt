package org.example.lesson_16

class Gamer(
    val name: String,
    var health: Int = 100,
    var strength: Int = 10,
) {

    init {
        require(health >= 0 && health <= 100)
        require(strength >= 0 && strength <= 20)
    }

    private fun checkDeath() {
        if (health <= 0) {
            println("$name умер.")
            health = 0
            strength = 0
        }
    }

    fun takeDamage(damage: Int) {
        health -= damage
        checkDeath()
    }

    fun heal(amount: Int) {
        if (health > 0) {
            health += amount
            if (health > 100) {
                health = 100
            }
            println("$name исцелён на ${amount}HP. текущее состояние здоровья: $health")
        } else {
            println("Вы не можете исцелить мёртвого игрока.")
        }
    }
}

fun main() {
    val gamer = Gamer("Dobriy Drobovik")

    gamer.takeDamage(45)
    gamer.heal(15)
    gamer.takeDamage(100)

    println("Финальный статус:")
    println("Здоровье: ${gamer.health}, Сила удара: ${gamer.strength}")
}