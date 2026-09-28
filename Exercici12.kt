import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Quants números vols introduir? ")
    val quantitat = scanner.nextInt()

    val numeros = IntArray(quantitat)
    var positius = 0
    var negatius = 0
    var zeros = 0

    for (i in 0 until quantitat) {
        print("Número ${i + 1}: ")
        numeros[i] = scanner.nextInt()

        if (numeros[i] > 0) {
            positius++
        } else if (numeros[i] < 0) {
            negatius++
        } else {
            zeros++
        }
    }

    println("Resultat:")
    println("Positius: $positius")
    println("Negatius: $negatius")
    println("Zeros: $zeros")
}