import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Introdueix una text: ")
    val text = scanner.nextLine()

    val vocals = "aeiou"
    var comptador = 0

    for (caracter in text) {
        if (caracter in vocals) {
            comptador++
        }
    }

    println("El text conté $comptador vocals.")
}