package br.com.alura.bytebank.model

class ContaPoupanca(
        titularConta: Cliente,
        numeroConta: Int
): ContaTransfere(
        titular = titularConta,
        numero = numeroConta
) {
    override fun sacar(valor: Double) {
        if(this.saldoConta >= valor) this.saldoConta -= valor
    }

}