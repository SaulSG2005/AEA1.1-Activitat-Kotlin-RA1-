class CompteBancari(val numeroCompte: String, var saldo: Double) {
    
    fun ingressar(quantitat: Double) {
        if (quantitat > 0) {
            saldo += quantitat
            println("Ingrés de $quantitat€ realitzat. Saldo actual: $saldo€")
        } else {
            println("La quantitat a ingressar ha de ser positiva.")
        }
    }

    fun retirar(quantitat: Double) {
        if (quantitat > 0 && quantitat <= saldo) {
            saldo -= quantitat
            println("Retirada de $quantitat€ realitzada. Saldo actual: $saldo€")
        } else if (quantitat > saldo) {
            println("Error: Saldo insuficient.")
        } else {
            println("La quantitat a retirar ha de ser positiva.")
        }
    }
}

fun main() {
    val compte = CompteBancari("ES123456789", 500.0)
    compte.ingressar(200.0)
    compte.retirar(150.0)
}