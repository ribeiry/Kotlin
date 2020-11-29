package br.com.alura.bytebank.teste

import br.com.alura.bytebank.model.Cliente
import br.com.alura.bytebank.model.ContaCorrente
import br.com.alura.bytebank.model.ContaPoupanca
import br.com.alura.bytebank.model.Endereco

fun testaComportamentos() {

    val conta = ContaCorrente(Cliente(
            "Augusto",
            "255225",
            senha = 2
    ),369)
    val conta1 = ContaPoupanca(Cliente(
            "Joana",
            "2583369",
            senha = 369,
            Endereco(
                    "Av Joao de Barros",
                    155,
                    "Socorro",
                    "São Paulo",
                    "SP",
                    "04890-185",
                    "Apto 84B"
            )
    ),25896)

    conta.deposita(850.58);
    conta1.deposita(250.58);

    println(conta.titularConta)
    println(conta.numeroConta)
    println(conta.saldoConta)

    println(conta1.titularConta)
    println(conta1.numeroConta)
    println(conta1.saldoConta)

    println("Digite valor para Déposito ${conta.titularConta}")
    conta.deposita(readLine()?.toDouble()!!)
    println("Saldo na conta da ${conta.titularConta} é ${conta.saldoConta}")

    println("Digite valor para Sacar ${conta.titularConta}")
    conta.sacar(readLine()?.toDouble()!!)
    println("Saldo na conta da ${conta.titularConta} é ${conta.saldoConta}")

    println("Digite valor para Déposito ${conta1.titularConta}")
    conta1.deposita(readLine()?.toDouble()!!)
    println("Saldo na conta da ${conta1.titularConta} é ${conta1.saldoConta}")

    println("Digite valor para Sacar ${conta1.titularConta}")
    conta1.sacar(readLine()?.toDouble()!!)
    println("Saldo na conta da ${conta1.titularConta} é ${conta1.saldoConta}")

    println("Digite valor para Transferir ${conta1.titularConta}")

    if (conta1.tranferencia(readLine()?.toDouble()!!, conta,369))
        println("Transferencia para ${conta.titularConta} saldo agora é ${conta.saldoConta}")
    else
        println("Falha ao executar a transferencia o saldo é ${conta1.saldoConta}")
}