package br.com.bytebank.applications

import br.com.bytebank.models.exceptions.InsufficientFundsException

fun main() {
    val value = readLine()
    if (value != null) {
        checkFunds(value.toDouble())
    }

}


fun runClassCastException() {
    throw ClassCastException()
}

fun runArithmeticException() {
    throw ArithmeticException()
}

fun runNumberFormatException() {
    throw NumberFormatException()
}

fun checkFunds(value: Double): Double {
    if (value <= 10.00) {
        throw InsufficientFundsException("Saldo Insuficiente!")
    }

    return value;
}