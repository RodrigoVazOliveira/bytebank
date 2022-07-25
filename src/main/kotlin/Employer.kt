class Employer(
    val name: String,
    val cpf: String,
    val salary: Double
) {
    fun bonicute(): Double {
        return this.salary * 0.1;
    }

    override fun toString(): String {
        return "Employer(name='$name', cpf='$cpf', salary=$salary)"
    }
}