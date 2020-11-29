package br.com.alura.bytebank.model

abstract class funcionario(
        val nome:String,
        val cpf:String,
        val salario:Double) {


    abstract val bonificacao:Double

}