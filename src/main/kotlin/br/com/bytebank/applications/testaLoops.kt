fun loopsTests() {

    for (i in 9 downTo 0 step 2) {
        println(i)
    }
    var i = 0;
    while (i < 5) {
        val holder = "Rodrigo Vaz $i"
        val accountNumber = 1000
        var balance = 100.0 * i
        println("titular da conta $holder")
        println("numero de conta: $accountNumber")
        println("saldo da conta: $balance")
        i++;
    }
}