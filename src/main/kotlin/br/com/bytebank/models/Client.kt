package br.com.bytebank.models

import br.com.bytebank.Authenticable
import br.com.bytebank.models.exceptions.UnauthenticationException

class Client(val name: String, val cpf: String, val password: String) : Authenticable {
    override fun authenticate(password: String): Boolean {
        if (this.password != password) {
            throw UnauthenticationException("Senha incorreta ao autenticar!")
        }

        return this.password == password;
    }

}