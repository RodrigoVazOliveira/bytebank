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
        if (password != password) {
            return false;
        }

        return true;
    }

    override fun bonicute(): Double {
        return this.salary * 0.2;
    }

    override fun toString(): String {
        return super.toString() + " Manager(password='$password')"
    }


}