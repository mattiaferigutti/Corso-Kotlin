package loops_breaker

fun main() {

    val mapFood = mapOf(
        "bananas" to 15,
        "mattresses" to 24,
        "dog kennels" to 42,
        "machine" to 120,
        "cheeses" to 5)

    var weight = 0
    val items = mutableListOf<String>()

    for ((cargoType, cargoWeight) in mapFood) {
        println("Cargo weight is $weight")
        if (weight >= 100) {
            println("   loop has been stopped")
            break
        }
        else if (weight + cargoWeight > 100) {
            println("   skipping $cargoType and $cargoWeight")
            continue
        }
        else {
            println("   adding $cargoType and $cargoWeight")
            items.add(cargoType)
            weight += cargoWeight
        }
    }

    println(weight)
    println("\n\nItems:")
    for (item in items) {
        println(item)
    }

    /*for ((cargoType, cargoWeight) in mapFood) {
        println("Cargo weight is $weight")
        if (weight >= 100) {
            println("   loop has been stopped")
            break
        }
        else {
            println("   adding $cargoType $cargoWeight")
            items.add(cargoType)
            weight += cargoWeight
        }
    }*/
}