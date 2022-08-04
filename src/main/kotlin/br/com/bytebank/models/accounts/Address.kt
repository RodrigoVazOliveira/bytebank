package br.com.bytebank.models.accounts

class Address(
    val publicPlace: String,
    number: Int,
    val neighborhood: String,
    val city: String,
    val state: String,
    val zipCode: String,
    val complement: String
) {
}