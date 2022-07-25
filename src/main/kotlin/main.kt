fun main() {
    println("Ola, bytebank")

    val rodrigo = Employer(
        name = "Rodrigo Vaz",
        cpf = "000.000.000-00",
        salary  = 1000.00
    )

    println(rodrigo)
    println("Cualcular a bonificacao ${rodrigo.bonicute()}")
}