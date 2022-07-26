class AccountChain(titular: String, numberAccount: Int, balance: Double = 0.0) :
    Account(titular, numberAccount, balance) {

        override fun sacar(value: Double) {
            if (balance >= 0.10) {
                this.balance -= 0.10
            }

            super.sacar(value)
        }
}