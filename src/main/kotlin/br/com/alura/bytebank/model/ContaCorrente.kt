package br.com.alura.bytebank.model

class ContaCorrente(
        titularConta: Cliente,
        numeroConta: Int
): ContaTransfere(
        titular = titularConta,
        numero = numeroConta
) {

    override fun sacar(valor: Double) {
        val valorComTaxa = valor + 0.1
        if(this.saldoConta >= valorComTaxa) this.saldoConta -= valorComTaxa
    }

}