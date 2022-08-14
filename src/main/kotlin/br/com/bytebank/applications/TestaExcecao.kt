package br.com.bytebank.applications

import br.com.bytebank.models.accounts.Address

fun main() {
    println("início main")
    functionOne()
    println("fim main")

    val entrada: String = "1.9"
    val value: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema ao converter")
        e.printStackTrace()
        null
    }

    val valurWithTax: Double? = valueWithTax(value)
    if (value != null) {
        println("valor recebido: $value")
    } else {
        println("Valor invalido")
    }

    println("valor com taxa: $valurWithTax")
}


fun valueWithTax(value: Double?): Double? {
    if (value  == null) {
        return null
    }

    return value + (value * 0.1)
}

fun functionOne() {
    println("início funcao1")
    functionTwo()
    println("fim funcao1")



}

fun functionTwo() {

    try {
        val divisor = 1 / 0
    } catch (e: ArithmeticException) {
        println(e.message)
    }

    try {
        val adress = Any()
        adress as Address
    } catch (e: ClassCastException) {
        println(e.message)
    }



    println("início funcao2")
    for (i in 1..5){
        println(i)
    }
    println("fim funcao2")



}