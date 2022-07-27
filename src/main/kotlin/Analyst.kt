class Analyst(name: String, cpf: String, salary: Double) : Employer(
    name,
    cpf,
    salary
) {

    override val bonicute: Double get() = (this.salary * 0.1) + salary

    override fun toString(): String {
        return "${super.toString()} Analyst(bonicute=$bonicute)"
    }


}