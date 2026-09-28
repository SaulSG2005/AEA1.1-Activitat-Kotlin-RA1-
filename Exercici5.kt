import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Introdueix un número de mes (1-12): ")
    val mesNum = scanner.nextInt()

    val mesNom = when (mesNum) {
        1 -> "Gener"
        2 -> "Febrer"
        3 -> "Març"
        4 -> "Abril"
        5 -> "Maig"
        6 -> "Juny"
        7 -> "Juliol"
        8 -> "Agost"
        9 -> "Setembre"
        10 -> "Octubre"
        11 -> "Novembre"
        12 -> "Desembre"
        else -> "Número no vàlid (ha de ser entre 1 i 12)"
    }

    println("El mes és: $mesNom")
}