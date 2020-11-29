package br.com.alura.bytebank.model

class Diretor(
        nome:String,
        cpf:String,
        salario:Double,
        senha: Int,
        val plr: Double
): FuncionarioAdmin(
        nome = nome,
        cpf = cpf,
        salario = salario,
        senha = senha
){

    override val bonificacao get()=   salario + plr

}