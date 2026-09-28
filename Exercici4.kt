import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Introdueix un número enter: ")
    val numero = scanner.nextInt()

    if (numero % 2 == 0) {
        println("El número $numero és parell.")
    } else {
        println("El número $numero és senar.")
    }
}