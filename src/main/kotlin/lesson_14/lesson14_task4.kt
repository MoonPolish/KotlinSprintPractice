package org.example.lesson_14

open class CelestianBoby(
    val name: String,
    val hasAtmosphere: Boolean = false,
    val suitableForLanding: Boolean = false,
)

class Planet(
    name: String,
    hasAtmosphere: Boolean = false,
    suitableForLanding: Boolean = false,
    var satellites: List<Satellite> = emptyList()
) : CelestianBoby(
    name,
    hasAtmosphere,
    suitableForLanding,
)

class Satellite(
    name: String,
    hasAtmosphere: Boolean = false,
    suitableForLanding: Boolean = false,
) : CelestianBoby(
    name,
    hasAtmosphere,
    suitableForLanding,
)

fun main() {
    val satelite1 = Satellite("Деймос")
    val satelite2 = Satellite("Фобос")

    val planet = Planet(
        "Марс",
        true,
    )

    println("Планета ${planet.name} и её спутники: ${satelite1.name} и ${satelite2.name}")
}