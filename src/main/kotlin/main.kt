fun main() {
    println("Ola, bytebank")
    val account = Account()
    account.titular = "rodrigo vaz"
    println(account.titular)

    val accountMari = Account()
    accountMari.titular = "Conta da mariana"
    println(accountMari.titular)
}

class Account {
    var titular = ""
    var numberAccount = 0
    var balance = 0.0


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


fun loopsTests() {

    for (i in 9 downTo 0 step 2) {
        println(i)
    }
    var i = 0;
    while (i < 5) {
        val holder = "Rodrigo Vaz $i"
        val accountNumber = 1000
        var balance = 100.0 * i
        println("titular da conta $holder")
        println("numero de conta: $accountNumber")
        println("saldo da conta: $balance")
        i++;
    }
}

fun testeVariaveis() {
    val holder = "Rodrigo Vaz"
    val accountNumber = 1000
    var balance = 100.0
    balance += 200

    println("titular da conta $holder")
    println("numero de conta: $accountNumber")
    println("saldo da conta: $balance")
}