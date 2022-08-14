package br.com.bytebank.applications

import br.com.bytebank.models.accounts.Address

fun main() {
    val addressNull:Address? = Address(city = "Uberlandia",
        complement = "43",
        neighborhood = "asdfads",
        number = 3, publicPlace = "43324",
        state = "43232",
        zipCode = "354234")

    addressNull?.let { address ->
        println(address.city.length)
    }
    println(addressNull?.city)
}
