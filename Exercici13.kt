class Persona(val nom: String, val edat: Int, val pais: String) {
    fun mostrarInformacio() {
        println("Nom: $nom, Edat: $edat, País: $pais")
    }
}

fun main() {
    val persona = Persona("Laura", 24, "Catalunya")
    persona.mostrarInformacio()
}