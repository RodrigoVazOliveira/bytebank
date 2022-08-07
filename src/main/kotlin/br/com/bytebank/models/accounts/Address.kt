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



    override fun toString(): String {
        return """
            Address(
            publicPlace='$publicPlace', 
            neighborhood='$neighborhood', 
            city='$city', 
            state='$state', 
            zipCode='$zipCode', 
            complement='$complement')
            """.trimIndent()
    }

    override fun equals(other: Any?): Boolean {
        if (javaClass != other?.javaClass) return false

        if (other != null && other is Address) {
            return this.zipCode == other.zipCode
        }

        return false
    }

    override fun hashCode(): Int {
        return zipCode.hashCode()
    }
}