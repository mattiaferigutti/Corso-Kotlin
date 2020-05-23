package collections

fun main() {

    val recipeMap = mutableMapOf("rec1" to "Pizza", "rec2" to "Thai", "rec3" to "Sushi")

    recipeMap.put("rec4", "Pasta")
    //recipeMap.remove("rec4")
    recipeMap.replace("rec4", "Meat")

    for ((key, value) in recipeMap) {
        println("key: $key, value: $value")
    }

}