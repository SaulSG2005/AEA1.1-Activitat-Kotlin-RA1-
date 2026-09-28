import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Introdueix el primer número: ")
    val n1 = scanner.nextDouble()
    print("Introdueix el segon número: ")
    val n2 = scanner.nextDouble()
    print("Introdueix el tercer número: ")
    val n3 = scanner.nextDouble()

    val mitjana = (n1 + n2 + n3) / 3
    println("La mitjana és: $mitjana")
}