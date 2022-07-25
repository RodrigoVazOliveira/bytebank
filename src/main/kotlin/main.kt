fun main() {
    println("Ola, bytebank")

    val rodrigo = Employer(
        name = "Rodrigo Vaz",
        cpf = "000.000.000-00",
        salary  = 1000.00
    )

    println(rodrigo)
    println("Cualcular a bonificacao ${rodrigo.bonicute()}")


    val roberto = Manager(
        name = "Roberto Jesus",
        cpf = "000.001.000-12",
        salary = 5000.0,
        password = "123456"
    )

    println(roberto)
    println("bonificacao do roberto e de : ${roberto.bonicute()}")

    if (roberto.isEqualPassword("123456")) {
        println("autenticacao realizada com sucess!")
    } else {
        println("Senha incorreta")
    }
}