import br.com.bytebank.models.Client
import br.com.bytebank.models.accounts.AccountChain
import br.com.bytebank.models.accounts.AccountSaving
import br.com.bytebank.models.exceptions.InsufficientFundsException

fun testeOrientacaoAObjecto() {
    val account = AccountChain(titular = Client(name = "Rodrigo", cpf = "3432234", password = "34343223"), numberAccount = 1000)
    println(account.titular)

    val accountMari = AccountSaving(numberAccount = 1001, titular = Client(name = "Mariana PF", cpf = "332432432", password = "324324"))
    accountMari.depositar(25000.00)
    println(accountMari.titular)
    println(accountMari.numberAccount)
    println(accountMari.balance)

    val numeroX = 10
    var numeroY = numeroX
    numeroY++
    println("O numero X $numeroX")
    println("o numero Y $numeroY")


    val accountJoao = AccountChain(Client(name = "Joao", cpf = "3432423", password = "3432423423"), 1002)
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

    try {
        accountJoao.transfer(accountMaria, 250.00, "3432423423")
        println("tranferencia efetuada com sucesso")
    } catch (e:  InsufficientFundsException) {
        println(e.message)
        e.printStackTrace()
    }
}