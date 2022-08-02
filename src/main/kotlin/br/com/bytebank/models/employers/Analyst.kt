package br.com.bytebank.models.employers

import br.com.bytebank.models.employers.Employer

class Analyst(name: String, cpf: String, salary: Double) : Employer(
    name,
    cpf,
    salary
) {

    override val bonicute: Double get() = (this.salary * 0.1) + salary

    override fun toString(): String {
        return "${super.toString()} br.com.bytebank.employers.Analyst(bonicute=$bonicute)"
    }


}