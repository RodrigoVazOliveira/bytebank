package br.com.bytebank.models.accounts

import br.com.bytebank.models.Client

class AccountChain(titular: Client, numberAccount: Int) :
    Account(titular, numberAccount) {
    override fun sacar(value: Double) {
        if (this.balance >= value) {
            this.balance -= value;
        }
    }

}