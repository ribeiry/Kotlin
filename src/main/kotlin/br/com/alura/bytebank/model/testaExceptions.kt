package br.com.alura.bytebank.model

class testaExceptions {
    fun funcao1(){
        println("início funcao1")
        funcao2()
        println("fim funcao1")
    }

    fun funcao2() {
        println("início funcao2")
        for (i in 1..5){
            println(i)
        }
        println("fim funcao2")
    }

    fun testaExpressao(){
        val entrada:String = "1"

        val valor:Double? = try{
            entrada.toDouble()
        }
        catch (e: NumberFormatException){
            println("Erro de conversão para Double")
            null
        }
        if(valor!= null) println("Valor convertido ${valor}")
        val valorComTaxa: Double? = when {
            valor != null -> {
                valor + 0.1
            }
            else -> {
                null
            }
        }
        //throw ArithmeticException()
        println(valorComTaxa)
    }
}