fun testaCondicoes(balance: Double) {
    if (balance > 0.0) {
        println("A conta e positiva")
    } else if (balance == 0.0) {
        println("a conta e neutra")
    } else {
        println("a conta e negativa")
    }

    when {
        balance > 0.0 -> println("O saldo e positivo")
        balance == 0.0 -> println("O saldo e neutro")
        balance < 0.0 -> println("O saldo e negativo")
    }

}