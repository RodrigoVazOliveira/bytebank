class SystemInternal {

    fun entry(employer: Authenticable, password: String) {
        if (employer.authenticate(password)) {
            println("Seja bem vindo!")
        } else {
            println("Falha na autenticacao")
        }
    }
}