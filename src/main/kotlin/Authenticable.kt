interface Authenticable {
    fun authenticate(password: String) : Boolean
}