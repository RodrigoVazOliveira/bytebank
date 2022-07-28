fun main() {
    println("Ola, bytebank")
    val contaCorrente = AccountChain(
        numberAccount = 1001,
        titular = "Rodrigo Vaz"
    )

    val accountSaving = AccountSaving(
        numberAccount = 1002,
        titular = "Blau Araujo"
    )

    contaCorrente.depositar(200.00)
    contaCorrente.sacar(25.00)
    contaCorrente.transfer(accountSaving, 200.00)
    accountSaving.depositar(100.00)
    accountSaving.sacar(200.00)
    accountSaving.transfer(contaCorrente, 2500.00)


}