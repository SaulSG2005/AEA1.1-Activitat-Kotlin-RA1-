class Cotxe(val marca: String, val model: String, val any: Int) {
    fun calcularEdat(anyActual: Int): Int {
        return anyActual - any
    }
}

fun main() {
    val cotxe = Cotxe("SEAT", "Ibiza", 2018)
    val anyActual = 2026
    println("El cotxe té ${cotxe.calcularEdat(anyActual)} anys.")
}