package br.com.bytebank.models.accounts

import br.com.bytebank.Authenticable
import br.com.bytebank.models.Client
import br.com.bytebank.models.exceptions.InsufficientFundsException

abstract class Account(val titular: Client, val numberAccount: Int) : Authenticable {

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

    override fun authenticate(password: String): Boolean {
        return titular.authenticate(password)
    }

    abstract fun sacar(value: Double)

    fun transfer(destination: Account, value: Double, password: String) {
        if (balance < value) {
            throw InsufficientFundsException("O saldo atual e mehor queo valor transferido")
        }

        authenticate(password)

        balance -= value
        destination.depositar(value)
    }
}