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
        val sizeComplement: Int = address.complement?.length ?: 0
        println("O tamanho do coomplemento e igual a $sizeComplement")
    }
    println(addressNull?.city)

    teste("3423423321zcx")
}

fun teste(value: Any) {
    val number: Int? = value as? Int
    println("O valor do teste e $number")
}