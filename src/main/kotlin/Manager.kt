class Manager(
    name: String, cpf: String, salary: Double, password: String
) : EmployerAdmin(name, cpf, salary, password) {

    override val bonicute: Double get() = (this.salary * 0.1) + (salary * 2)

    override fun toString(): String {
        return super.toString() + " Manager(password='$password')"
    }


}