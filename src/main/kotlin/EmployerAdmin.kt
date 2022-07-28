abstract class EmployerAdmin(
    name: String,
    cpf: String,
    salary: Double,
    val password: String
) : Employer(name, cpf, salary), Authenticable {
    override fun authenticate(password: String) : Boolean {
        return this.password == password;
    }

    override fun toString(): String {
        return "Employer(name='$name', cpf='$cpf', salary=$salary)"
    }
}