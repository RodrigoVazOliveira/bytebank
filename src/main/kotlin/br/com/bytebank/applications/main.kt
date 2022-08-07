package br.com.bytebank.applications

fun main() {
    println()
    println(1)
    println(1.0)
    println(true)
    println("testes")

    printPersonalize(" 32432")
    printPersonalize(1)
    printPersonalize(1.0)
    printPersonalize("adsfad")
}

fun printPersonalize(value: Any) {
    println(value)
}