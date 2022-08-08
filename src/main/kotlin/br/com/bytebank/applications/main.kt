package br.com.bytebank.applications

import br.com.bytebank.models.accounts.Address

fun main() {
    println("início main")
    functionOne()
    println("fim main")
}

fun functionOne() {
    println("início funcao1")
    functionTwo()
    println("fim funcao1")
}

fun functionTwo() {
    val divisor = 1 / 0
    val adress = Any()
    adress as Address



    println("início funcao2")
    for (i in 1..5){
        println(i)
    }
    println("fim funcao2")
}