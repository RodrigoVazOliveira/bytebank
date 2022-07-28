import br.com.bytebank.Client
import br.com.bytebank.SystemInternal
import br.com.bytebank.models.employers.Director
import br.com.bytebank.models.employers.Manager

fun main() {
    val manager = Manager(name = "Rodrigo Vaz", cpf = "343432223", salary = 20000.00, password = "123456")
    val director = Director(name = "Paulo",  cpf = "2345234321",  salary = 500000.00,  password = "654321", plr = 25000.0)
    val rodrigoClient = Client(name = "Rodrigo", cpf = "34232", password = "432423")

    val systemInternal = SystemInternal()
    systemInternal.entry(manager, "123456")
    systemInternal.entry(manager, "123")
    systemInternal.entry(rodrigoClient, "23423423")

    println("bonificacao do diretor: ${director.bonicute}")
}