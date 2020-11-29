package br.com.alura.bytebank.teste

import br.com.alura.bytebank.exception.ContaException
import br.com.alura.bytebank.exception.falhaAutenticacaoException
import br.com.alura.bytebank.model.*

public fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(Cliente(
            "Augusto",
            "255225",
            senha = 2
    ),369)
    val contaPoupanca = ContaPoupanca(Cliente(
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
    val contaSalario = ContaSalario( Cliente(
            "Gui",
            "1002258",
            senha = 66
    ),2589)

    
    contaCorrente.deposita(1000.00)

    println("br.Conta do ${contaCorrente.titularConta}/ ${contaCorrente.numeroConta} " +
            "depositado o valor o seu saldo é de ${contaCorrente.saldoConta}")

    contaPoupanca.deposita(1000.00)
    println("br.Conta do ${contaPoupanca.titularConta}/ ${contaPoupanca.numeroConta} " +
            "depositado o valor o seu saldo é de ${contaPoupanca.saldoConta}")

    contaCorrente.sacar(100.00)
    println("br.Conta do ${contaCorrente.titularConta}/ ${contaCorrente.numeroConta} " +
            "retirado o valor o seu saldo é de ${contaCorrente.saldoConta}")

    contaPoupanca.sacar(100.00)
    println("br.Conta do ${contaPoupanca.titularConta}/ ${contaPoupanca.numeroConta} " +
            "retirado o valor o seu saldo é de ${contaPoupanca.saldoConta}")

    try{
        contaCorrente.tranferencia(100.00, contaPoupanca,2)

        println("saldo da conta corrente ${contaCorrente.saldoConta} apos transferencia" +
                "saldo da br.Conta Poupança ${contaPoupanca.saldoConta} apos transferencia")

        contaPoupanca.tranferencia(100.00, contaCorrente,369)

        println("saldo da conta Poupança ${contaPoupanca.saldoConta} apos transferencia" +
                "saldo da br.Conta Corrente ${contaCorrente.saldoConta} apos transferencia")

        contaSalario.deposita(1000.0)
        println("O saldo na conta salario é ${contaSalario.saldoConta}")

        contaSalario.sacar(100.0)
        println("O saldo na conta salario é ${contaSalario.saldoConta}")

        contaCorrente.tranferencia(100.0, contaSalario,2)

        println("saldo corrente após transferir para salário: ${contaCorrente.saldoConta}")
        println("saldo salário após receber transferência: ${contaSalario.saldoConta}")

        contaPoupanca.tranferencia(200.0, contaSalario,368)

        println("saldo poupança após transferir para salário: ${contaPoupanca.saldoConta}")
        println("saldo salário após receber transferência: ${contaSalario.saldoConta}")

    }
    catch (e: ContaException){
        println("Falha na transferencia")
        e.printStackTrace()
    }
    catch (e: falhaAutenticacaoException){
        println("Erro ao authenticar")
        e.printStackTrace()
    }

    println("O Cliente da conta poupança é ${contaPoupanca.titularConta.nome} e ele mora no endereço ${contaPoupanca.titularConta.endereco.logradouro}")

}

