package br.com.alura.bytebank.model

class Cliente(
        var nome: String,
        var cpf: String,
        private val senha: Int,
        var endereco: Endereco = Endereco()
): Autenticavel {
    override fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }


}