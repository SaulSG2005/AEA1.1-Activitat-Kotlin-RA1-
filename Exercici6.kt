import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var suma = 0
    var numero: Int

    println("Introdueix números (introdueix 0 per acabar):")
    do {
        numero = scanner.nextInt()
        suma += numero
    } while (numero != 0)

    println("La suma total dels números introduïts és: $suma")
}