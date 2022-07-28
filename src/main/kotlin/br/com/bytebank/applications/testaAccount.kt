import br.com.bytebank.models.accounts.AccountChain
import br.com.bytebank.models.accounts.AccountSaving

fun testeOrientacaoAObjecto() {
    val account = AccountChain(titular = "rodrigo vaz", numberAccount = 1000)
    println(account.titular)

    val accountMari = AccountSaving(numberAccount = 1001, titular = "Conta da mariana")
    accountMari.depositar(25000.00)
    println(accountMari.titular)
    println(accountMari.numberAccount)
    println(accountMari.balance)

    val numeroX = 10
    var numeroY = numeroX
    numeroY++
    println("O numero X $numeroX")
    println("o numero Y $numeroY")


    val accountJoao = AccountChain("Joao", 1002)
    var accountMaria = accountJoao

    println("A titula da conta joao ${accountJoao.titular}")
    println("O titular da conta maria e ${accountMaria.titular}")

    accountJoao.depositar(2500.00)
    accountMaria.depositar(1500.00)


    println("saldo atual de joao ${accountJoao.balance}")
    println("saldo atual de maiar ${accountMaria.balance}")

    accountJoao.sacar(250.00)
    accountMaria.sacar(2500.00)

    println("saldo atual de joao ${accountJoao.balance}")
    println("saldo atual de maiar ${accountMaria.balance}")

    if (accountJoao.transfer(accountMaria, 250.00)) {
        println("tranferencia efetuada com sucesso")
    } else {
        println("transferencia nao efetuada")
    }

}