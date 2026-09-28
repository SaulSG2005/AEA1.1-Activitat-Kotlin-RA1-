fun factorial(n: Int): Long {
    var resultat = 1L
    for (i in 1..n) {
        resultat *= i
    }
    return resultat
}

fun main() {
    val num = 5
    println("El factorial de $num és: ${factorial(num)}")
}