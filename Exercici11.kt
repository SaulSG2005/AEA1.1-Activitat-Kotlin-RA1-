fun obtenirParells(array: IntArray): IntArray {
    return array.filter { it % 2 == 0 }.toIntArray()
}

fun main() {
    val numeros = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val parells = obtenirParells(numeros)

    println("Números parells: ${parells.joinToString(", ")}")
}