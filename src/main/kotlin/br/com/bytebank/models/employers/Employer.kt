package br.com.bytebank.models.employers

abstract class Employer(
    val name: String,
    val cpf: String,
    val salary: Double,
) {
    abstract val bonicute: Double

    override fun toString(): String {
        return "br.com.bytebank.employers.Employer(name='$name', cpf='$cpf', salary=$salary)"
    }
}