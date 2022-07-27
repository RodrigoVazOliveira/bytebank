class Manager(
    name: String,
    cpf: String,
    salary: Double,
    val password: String
) : Employer(
    name,
    cpf,
    salary
) {

    fun isEqualPassword(password: String) : Boolean {
        return this.password == password;
    }

    override val bonicute: Double get() = (this.salary * 0.1) + (salary * 2)

    override fun toString(): String {
        return super.toString() + " Manager(password='$password')"
    }


}