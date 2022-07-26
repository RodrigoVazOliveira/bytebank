class AccountSaving(titular: String, numberAccount: Int, balance: Double = 0.0) :
    Account(titular, numberAccount, balance) {

    override fun sacar(value: Double) {
        if (this.balance >= 10.0) {
            this.balance -= 0.10
        }

        super.sacar(value)
    }
}