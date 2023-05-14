private fun testaFuncionarios() {
    val alex = Funcionario(
        nome = "alex",
        cpf = "111.111.111-11",
        salario = 1000.0,

        )

    val fran = Gerente(
        nome = "fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )
    val gui = Diretor(
        nome = "gui",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 1233,
        plr = 200.0
    )
    val maria = Analista(
        nome = "maria",
        cpf = "444.444.444-44",
        salario = 3000.0

    )

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificação ${alex.bonificacao()}")


    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificação ${fran.bonificacao()}")

    if (fran.autentica(1234)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }

    println("nome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salario}")
    println("bonificação ${gui.bonificacao()}")
    println("PLR ${gui.plr}")

    if (gui.autentica(1233)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }
    println("nome ${maria.nome}")
    println("cpf ${maria.cpf}")
    println("salario ${maria.salario}")
    println("bonificação ${maria.bonificacao()}")

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)

    println("total de bonificação ${calculadora.total}")
}