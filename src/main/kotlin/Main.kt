fun main() {
    println("Bem vindo ao Bytebank")

    val alex = Funcionario(
    nome = "alex",
    cpf = "111.111.111-11",
    salario = 1000.0,

    )

    val fran = Gerente(
        nome = "fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 123
    )

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificação ${alex.bonificacao()}")


    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificação ${fran.bonificacao()}")

    if(fran.autentica(1234)){
        println("autenticou com sucesso")
    }else{
        println("falha na autenticação")
    }
}




