package br.com.alura.bytebank.model

class Analista(
        nome: String,
        cpf: String,
        salario: Double
): funcionario(
        nome = nome,
        cpf = cpf,
        salario = salario
) {
    override val bonificacao: Double
        get() = salario *0.1
}