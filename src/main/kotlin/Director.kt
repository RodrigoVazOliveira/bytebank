class Director(
    val plr: Double, name: String, cpf: String, salary: Double, password: String
) : EmployerAdmin(name, cpf, salary, password) {

    override val bonicute: Double get() = (this.salary * 0.2) + this.salary

    override fun toString(): String {
        return "${super.toString()} Director(password='$password', plr=$plr)"
    }
}