package br.com.alura.bytebank.model

class ContaSalario(
        titular: Cliente,
        numero: Int
): Conta(
        titularConta = titular,
        numeroConta = numero
) {
    override fun sacar(valor: Double) {
        if(this.saldoConta >= valor)
            this.saldoConta -= valor
    }
}