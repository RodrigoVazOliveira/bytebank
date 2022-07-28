package br.com.bytebank

import br.com.bytebank.models.employers.Employer

class CalculateBonicute {
    var total: Double = 0.0
        private set

    fun register(employer: Employer) {
        this.total += employer.bonicute
    }
}