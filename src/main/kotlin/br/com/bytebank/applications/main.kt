package br.com.bytebank.applications

import br.com.bytebank.models.accounts.Address

fun main() {
    val addressNull:Address? = null
    val addressNotNull: Address = addressNull!!
    addressNotNull.city

}
