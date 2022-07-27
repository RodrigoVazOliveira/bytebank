abstract class Employer(
    val name: String,
    val cpf: String,
    val salary: Double,
) {
    abstract val bonicute: Double

    override fun toString(): String {
        return "Employer(name='$name', cpf='$cpf', salary=$salary)"
    }
}