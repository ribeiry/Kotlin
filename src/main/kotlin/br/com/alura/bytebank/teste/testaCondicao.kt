package br.com.alura.bytebank.teste

fun testaCondições(saldoConta:Double){

    when {
        saldoConta > 0.00 ->{println("br.Conta com saldo positivo")}
        saldoConta == 0.00 ->{println("br.Conta com saldo Zerado")}
        else -> {println("br.Conta com saldo negativo")}
    }
}