class Analyst(name: String, cpf: String, salary: Double) : Employer(name, cpf, salary) {

    override val bonicute: Double
        get() = super.bonicute + (salary * 2.0)

    override fun toString(): String {
        return "${super.toString()} Analyst(bonicute=$bonicute)"
    }


}