package br.com.bytebank

import br.com.bytebank.Authenticable

class Client(val name: String, val cpf: String, val password: String) : Authenticable {
    override fun authenticate(password: String): Boolean {
        return this.password == password;
    }

}