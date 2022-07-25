class Account(val titular: String, val numberAccount: Int, var balance: Double = 0.0) {
    fun depositar(value: Double) {
        balance += value
    }

    fun sacar(value: Double) {
        if (balance >= value) {
            balance -= value
        }
    }

    fun transfer(destination: Account, value: Double): Boolean {
        if (balance >= value) {
            balance -= value
            destination.depositar(value)
            return true
        }

        return false
    }
}