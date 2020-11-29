package br.com.alura.bytebank.model

abstract class Conta(val titularConta: Cliente, val numeroConta: Int):Autenticavel {
    abstract fun sacar(valor: Double)
    var saldoConta: Double = 0.00
        protected  set
        companion object{
            var total =0
            private set
        }

    init {
        total ++;
    }
    fun deposita(valor: Double){
        if(valor > 0 ) this.saldoConta += valor
    }

    override fun autentica(senha: Int): Boolean {
        return titularConta.autentica(senha)
    }
}
