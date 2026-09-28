import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val numeros = IntArray(5)
    var suma = 0

    println("Introdueix 5 números enters:")
    for (i in 0 until 5) {
        print("Número ${i + 1}: ")
        numeros[i] = scanner.nextInt()
        suma += numeros[i]
    }

    println("La suma dels 5 números és: $suma")
}