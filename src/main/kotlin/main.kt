fun main() {
    println("Ola, bytebank")
    val holder = "Rodrigo Vaz"
    val accountNumber = 1000
    var balance = 100.0
    balance += 200

    println("titular da conta $holder")
    println("numero de conta: $accountNumber")
    println("saldo da conta: $balance")

    // testaCondicoes(balance)


    for (i in 9 downTo 0 step 2) {
        println(i)
    }
}

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
