package br.com.alura.bytebank.test

import br.com.alura.bytebank.model.Cliente
import br.com.alura.bytebank.model.ContaCorrente
import br.com.alura.bytebank.model.ContaPoupanca


fun testaObjects() {
        //    val fran = object : Autenticavel{
//        val nome: String = "fran"
//        val cpf: String = "111.111.111-11"
//        val senha : Int = 1000
//
//         override fun autentica(senha: Int) = this.senha == senha
//
//    } usado para teste de singleton, da flexibilidade e afins
//
//    val sistemaInterno = SistemaInterno()
//    sistemaInterno.entra(fran,1000)

        val alex = Cliente(nome = "alex", cpf = "", senha = 1)
        val contaPoupanca = ContaPoupanca(titular = alex, 1000)
        val contaCorrente = ContaCorrente(alex, 1001)
    }

