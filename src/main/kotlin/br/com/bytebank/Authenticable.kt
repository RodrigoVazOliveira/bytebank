package br.com.bytebank

interface Authenticable {
    fun authenticate(password: String) : Boolean
}