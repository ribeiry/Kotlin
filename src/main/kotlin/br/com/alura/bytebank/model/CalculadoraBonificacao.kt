package br.com.alura.bytebank.model

class CalculadoraBonificacao {

    var total: Double = 0.0
        private  set
    fun registra(funcionario: funcionario){
        this.total += funcionario.bonificacao
    }
}