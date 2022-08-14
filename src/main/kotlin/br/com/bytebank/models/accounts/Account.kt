package br.com.bytebank.models.accounts

import br.com.bytebank.models.Client
import br.com.bytebank.models.exceptions.InsufficientFundsException

abstract class Account(val titular: Client, val numberAccount: Int) {

    var balance: Double = 0.0
        protected set
    var  counter: Int = 0
        private set

    init {
        counter++
    }

    fun depositar(value: Double) {
        balance += value
    }

    abstract fun sacar(value: Double)

    fun transfer(destination: Account, value: Double) {
        if (balance < value) {
            throw InsufficientFundsException("O saldo atual e mehor queo valor transferido")
        }

        balance -= value
        destination.depositar(value)
        return true
    }
}