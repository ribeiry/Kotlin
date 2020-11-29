package br.com.alura.bytebank.model

import br.com.alura.bytebank.exception.ContaException
import br.com.alura.bytebank.exception.falhaAutenticacaoException

@Suppress("UNREACHABLE_CODE")
abstract class ContaTransfere(
        titular: Cliente,
        numero: Int
): Conta(
        titularConta = titular,
        numeroConta = numero
) {

    fun tranferencia(valor: Double, destino: Conta,senha:Int): Boolean {
        if(!autentica(senha)) throw falhaAutenticacaoException()
        return if (this.saldoConta >= valor) {
            this.saldoConta -= valor
            destino.deposita(valor)
            true
        }
        else{
            throw ContaException(
                    "O valor é insuficiente, saldo ${this.saldoConta}, valor a ser transferido ${valor}"
            )
            false
        }

    }
}