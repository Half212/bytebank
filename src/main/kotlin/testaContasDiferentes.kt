fun testaContasDiferentes() {
    var contaCorrente = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )
    var contaPoupanca = ContaPoupanca(
        titular = "Fran",
        numero = 1001
    )
    val contaSalario = ContaSalario(
        titular = "Gui",
        numero = 1002
    )
    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    contaSalario.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")
    println("saldo conta salario. ${contaSalario.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
    contaSalario.saca(100.0)

    println("saldo corrente apos saque: ${contaCorrente.saldo}")
    println("saldo poupança apos saque: ${contaPoupanca.saldo}")
    println("saldo salario apos saque: ${contaSalario.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("saldo corrente apos transferir: ${contaCorrente.saldo}")
    println("saldo poupança apos receber transferir: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.0, contaCorrente)

    println("saldo poupança apos transferir: ${contaPoupanca.saldo}")
    println("saldo corrente apos receber transferir: ${contaCorrente.saldo}")

    contaCorrente.transfere(100.0, contaSalario)

    println("saldo corrente após transferir para salário: ${contaCorrente.saldo}")
    println("saldo salário após receber transferência: ${contaSalario.saldo}")

    contaPoupanca.transfere(200.0, contaSalario)

    println("saldo poupança após transferir para salário: ${contaPoupanca.saldo}")
    println("saldo salário após receber transferência: ${contaSalario.saldo}")
}