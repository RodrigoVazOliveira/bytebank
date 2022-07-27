class Director(
    name: String,
    cpf: String,
    salary: Double,
    val password: String,
    val plr: Double
) : Employer(
    name,
    cpf,
    salary
) {

    override val bonicute: Double get() = (this.salary * 0.2) + this.salary

    fun isEqualPassword(password: String) : Boolean {
        return this.password == password;
    }

    override fun toString(): String {
        return "${super.toString()} Director(password='$password', plr=$plr)"
    }
}