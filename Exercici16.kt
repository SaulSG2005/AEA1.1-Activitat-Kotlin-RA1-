class Llibre(val titol: String, val autor: String, var preu: Double) {

    fun aplicarDescompte(percentatge: Double) {
        if (percentatge in 0.0..100.0) {
            val descompte = preu * (percentatge / 100)
            preu -= descompte
            println("S'ha aplicat un descompte del $percentatge%. Nou preu: $preu€")
        } else {
            println("Percentatge de descompte no vàlid.")
        }
    }
}

fun main() {
    val llibre = Llibre("El Quixot", "Miguel de Cervantes", 20.0)
    llibre.aplicarDescompte(15.0)
}