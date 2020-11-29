package br.com.alura.bytebank

import br.com.alura.bytebank.model.Endereco
import br.com.alura.bytebank.teste.testaContasDiferentes

fun main() {

    val idades= intArrayOf(25,19,33,20,55,40)
    var maiorIdade:Int = 0

    for(idade in idades){

        if(idade > maiorIdade) maiorIdade = idade
    }
    println(maiorIdade)

    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if(idade < menorIdade) menorIdade = idade
    }

    println(menorIdade)
}



