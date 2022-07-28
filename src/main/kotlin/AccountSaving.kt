class AccountSaving(titular: String, numberAccount: Int) :
    Account(titular, numberAccount) {

    override fun sacar(value: Double) {
        if (this.balance >= 10.0) {
            this.balance -= 0.10
        }


    }
}