package br.com.bytebank.models.accounts

import br.com.bytebank.models.Client

class AccountSaving(titular: Client, numberAccount: Int) :
    Account(titular, numberAccount) {

    override fun sacar(value: Double) {
        if (this.balance >= 10.0) {
            this.balance -= 0.10
        }


    }
}