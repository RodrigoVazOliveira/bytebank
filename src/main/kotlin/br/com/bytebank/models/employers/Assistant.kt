package br.com.bytebank.models.employers

class Assistant(name: String, cpf: String, salary: Double) : Employer(
    name,
    cpf,
    salary
) {

    override val bonicute: Double get() = this.salary * 0.05
}