package lambdas

fun main() {

    fun converterNumber(number: Int, converter: (Int) -> Double) : Double {
        val result = converter(number)
        println("$number has been converted to $result")
        return result
    }

    converterNumber (5) { it * 1.8 + 35 }

    fun getConversion(string: String): (Double) -> Double {
        when(string) {
            "CentigradeToFahrenheit" -> return { it * 1.8 + 32 }
            "KgsToPounds" -> return { it * 2.204623 }
            "PoundsToUsTons" -> return { it / 2000.0 }
            else -> return { it }
        }
    }

    val ponds = getConversion("KgsToPounds")(89.0)
    println(ponds)

}