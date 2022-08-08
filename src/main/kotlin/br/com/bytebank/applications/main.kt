package br.com.bytebank.applications

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
    println("início funcao2")
    for (i in 1..5){
        println(i)
    }
    println("fim funcao2")
}