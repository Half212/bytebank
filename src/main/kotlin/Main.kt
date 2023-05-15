fun main() {
    println("Bem vindo ao Bytebank")

    var contaCorrente = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )
    var contaPoupanca = ContaPoupanca(
        titular = "Fran",
        numero = 1001
    )
    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo corrente apos saque: ${contaCorrente.saldo}")
    println("saldo poupança apos saque: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0,contaPoupanca)

    println("saldo corrente apos transferir: ${contaCorrente.saldo}")
    println("saldo poupança apos receber transferir: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.0,contaCorrente)

    println("saldo poupança apos transferir: ${contaPoupanca.saldo}")
    println("saldo corrente apos receber transferir: ${contaCorrente.saldo}")
}



