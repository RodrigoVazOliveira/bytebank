abstract class Account(val titular: String, val numberAccount: Int) {

    var balance: Double = 0.0
        protected set

    fun depositar(value: Double) {
        balance += value
    }

    abstract fun sacar(value: Double)

    fun transfer(destination: Account, value: Double): Boolean {
        if (balance >= value) {
            balance -= value
            destination.depositar(value)
            return true
        }

        return false
    }
}