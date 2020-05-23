package lambdas

class CustomObject {
    private var listener: ((String) -> Unit)? = null

    init {
        listener = null
    }

    fun setListener(l: (String) -> Unit) {
        if (this.listener == null)
            this.listener = l
    }

    fun sendData(data: String) {
        listener?.invoke(data)
    }
}

fun main() {
    val obj = CustomObject()
    obj.setListener {
        println("data: $it")
    }
    obj.sendData("Hi Mattia")
}