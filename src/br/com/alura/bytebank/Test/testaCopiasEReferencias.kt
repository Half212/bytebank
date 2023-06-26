package br.com.alura.bytebank.test

import br.com.alura.bytebank.model.Cliente
import br.com.alura.bytebank.model.ContaCorrente
import br.com.alura.bytebank.model.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    var contaJoao = ContaCorrente(
        Cliente(
            nome = "joao",
            cpf = "",
            senha = 1
        ), 1002
    )
    contaJoao.titular.nome = "João"
    var contaMaria = ContaPoupanca(
        Cliente(
            nome = "Maria",
            cpf = "",
            senha = 2
        ), 1003
    )
    contaMaria.titular.nome = "Maria"
    contaJoao.titular.nome = "João"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}