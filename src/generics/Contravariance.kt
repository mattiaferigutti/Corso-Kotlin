package generics

fun main() {

    val flowerTender = object : FlowerCare<Flower> {
        override fun prune(flower: Flower) = println("I'm pruning ${flower.name}")
    }

    val roseTender = object : FlowerCare<Rose> {
        override fun prune(flower: Rose) = println("I'm pruning rose")
    }

    val roseGarden = Garden<Rose>(listOf(Rose(), Rose()), flowerTender)
    roseGarden.tendFlower(0)

    val daffodilTender = object : FlowerCare<Daffodil> {
        override fun prune(flower: Daffodil) = println("I'm pruning daffodil")
    }

    val daffodilGarden = Garden<Daffodil>(listOf(Daffodil(), Daffodil()), flowerTender)
    daffodilGarden.tendFlower(1)

}

class Garden<T: Flower>(val flowers: List<T>, val flowerCare: FlowerCare<T>) {
    fun pickFlower(i: Int) = flowers[i]
    fun tendFlower(i: Int) {
        flowerCare.prune(flowers[i])
    }
}

open class Flower(val name: String) {

}

class Rose: Flower("Rose") {

}

class Daffodil: Flower("Daffodil") {

}

interface FlowerCare<in T> {
    fun prune(flower: T)

    //fun pickFlower() : T
}