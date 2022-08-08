package br.com.bytebank.applications

import br.com.bytebank.models.accounts.Address

fun testeAny() {
    println()
    println(1)
    println(1.0)
    println(true)
    println("testes")

    printPersonalize(" 32432")
    printPersonalize(1)
    printPersonalize(1.0)
    printPersonalize("adsfad")

    val addressOne = Address("sdfasd", 343, " adsfads", "32423", "4323", "4334", "")
    val addressTwo = Address("sdfasd", 343, " adsfads", "32423", "4323", "43341", "")

    val isEqual = addressOne == addressTwo

    println(isEqual)
    println(addressOne)
}

fun printPersonalize(value: Any) {
    println(value)
}