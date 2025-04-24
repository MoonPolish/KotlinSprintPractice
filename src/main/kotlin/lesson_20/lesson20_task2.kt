package org.example.lesson_20

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int,
) {
    fun displayHeath() {
        println("$name: текущее здоровье = $currentHealth, максимальное здоровье = $maxHealth")
    }
}

fun main() {
    val player = Player(
        "Рэма",
        49,
        100,
    )

    player.displayHeath()

    val healPotion: (Player) -> Unit = { player ->
        player.currentHealth = player.maxHealth
        println("${player.name} использовал(а) лечебное зелье!")
    }

    healPotion(player)

    player.displayHeath()
}