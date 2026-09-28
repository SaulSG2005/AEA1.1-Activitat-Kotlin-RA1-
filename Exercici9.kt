import java.util.Scanner

fun imprimirOrdenat(array: IntArray) {
    val arrayOrdenat = array.sortedArray()
    println("Números en ordre ascendent: ${arrayOrdenat.joinToString(", ")}")
}

fun main() {
    val scanner = Scanner(System.`in`)
    val numeros = IntArray(10)

    println("Introdueix 10 números enters:")
    for (i in 0 until 10) {
        print("Número ${i + 1}: ")
        numeros[i] = scanner.nextInt()
    }

    imprimirOrdenat(numeros)
}