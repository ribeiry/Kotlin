package br.com.alura.bytebank.teste

fun testaLacos(){
    println("Bem Vindo ao ByteBank");
    val titular: List<String> = listOf<String>("João","Juliana","Pedro","Maria","Fabiana","Eduardo");
    var saldoConta: Double = 00.00;
    var valorRetirada: Double =00.00
    for (i in 0..5) {
        val numeroConta: Int = 1000;
        valorRetirada = 0.00
        saldoConta = 100.00

        println("Titular da br.Conta ${titular[i]}");
        println("Numero da br.Conta $numeroConta");
        println("Saldo da br.Conta $saldoConta");
        println("Digite valor para retirada")

        valorRetirada = readLine()?.toDouble()!!
        saldoConta -= valorRetirada

        println("Saldo na conta $saldoConta")

        println("--------------------------------------")
        testaCondições(saldoConta)
        println("--------------------------------------")
    }
}