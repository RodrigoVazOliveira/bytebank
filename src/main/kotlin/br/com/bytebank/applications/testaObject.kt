package br.com.bytebank.applications

import br.com.bytebank.Authenticable
import br.com.bytebank.SystemInternal
import br.com.bytebank.models.Client
import br.com.bytebank.models.employers.Director
import br.com.bytebank.models.employers.Manager

fun testaObject() {
    val manager = Manager(name = "Rodrigo Vaz", cpf = "343432223", salary = 20000.00, password = "123456")
    val director = Director(name = "Paulo",  cpf = "2345234321",  salary = 500000.00,  password = "654321", plr = 25000.0)
    val rodrigoClient = Client(name = "Rodrigo", cpf = "34232", password = "432423")

    val systemInternal = SystemInternal()
    systemInternal.entry(manager, "123456")
    systemInternal.entry(manager, "123")
    systemInternal.entry(rodrigoClient, "23423423")


    val fran = object : Authenticable {
        val name = "Rodrigo"
        val cpf = "3432432"
        val password = "3243244"

        override fun authenticate(password: String) = this.password == password
    }

    println("nome do cliente: ${fran.name}")
    println("bonificacao do diretor: ${director.bonicute}")

    val cliente = Client(name = "423", cpf = "3432", password = "3423")
    println(cliente)
}