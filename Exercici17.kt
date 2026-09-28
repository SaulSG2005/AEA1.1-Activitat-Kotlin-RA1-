class Estudiant(val nom: String, val edat: Int, val notaMitjana: Double) {

    fun haAprovat(): Boolean {
        return notaMitjana >= 5.0
    }

    fun mostrarEstat() {
        if (haAprovat()) {
            println("$nom ha APROVAT amb una nota mitjana de $notaMitjana.")
        } else {
            println("$nom ha SUSPÈS amb una nota mitjana de $notaMitjana.")
        }
    }
}

fun main() {
    val estudiant1 = Estudiant("Marc", 20, 6.5)
    val estudiant2 = Estudiant("Anna", 19, 4.2)

    estudiant1.mostrarEstat()
    estudiant2.mostrarEstat()
}