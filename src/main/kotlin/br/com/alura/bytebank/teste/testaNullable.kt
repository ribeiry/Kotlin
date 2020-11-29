package br.com.alura.bytebank.teste

import br.com.alura.bytebank.model.Endereco

class testaNullable {

    fun testaNullable() {
        var enderecoNulo: Endereco? = Endereco(logradouro = "rua vergueiro", complemento = "Apto84b")
        var logradouroNovo: String? = enderecoNulo?.logradouro
        enderecoNulo?.let {
            println(it.logradouro.length)
            val tamanhoComplemento: Int =
                    it.complemento?.length ?: throw IllegalStateException("Complemento não pode ser vazio")
            println(tamanhoComplemento)
        }

    }
}