import br.com.bytebank.models.Client
import br.com.bytebank.models.accounts.AccountChain
import br.com.bytebank.models.accounts.AccountSaving
import java.util.UUID

fun main() {
    println("Ola, bytebank")
    val contaCorrente = AccountChain(
        numberAccount = 1001,
        titular = Client(name = "Rodrigo Vaz", cpf = UUID.randomUUID().toString(), password = "123123121231")
    )

    val accountSaving = AccountSaving(
        numberAccount = 1002,
        titular = Client(name = "Meretriz", cpf = UUID.randomUUID().toString(), password = "123123121231")
    )

    contaCorrente.depositar(200.00)
    contaCorrente.sacar(25.00)
    contaCorrente.transfer(accountSaving, 200.00, "123123121231")
    accountSaving.depositar(100.00)
    accountSaving.sacar(200.00)
    accountSaving.transfer(contaCorrente, 2500.00, "123123121231")


}