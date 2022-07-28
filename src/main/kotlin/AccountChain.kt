class AccountChain(titular: String, numberAccount: Int) :
    Account(titular, numberAccount) {
    override fun sacar(value: Double) {
        if (this.balance >= value) {
            this.balance -= value;
        }
    }

}