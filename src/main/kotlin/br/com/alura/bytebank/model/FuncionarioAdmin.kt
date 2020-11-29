package br.com.alura.bytebank.model

abstract class FuncionarioAdmin(
        nome:String,
        cpf:String,
        salario:Double,
        val senha: Int): funcionario(
        nome = nome,
        cpf = cpf,
        salario = salario
), Autenticavel {

    override fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }


}