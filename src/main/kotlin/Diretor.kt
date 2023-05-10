class Diretor(
     nome: String,
     cpf: String,
     salario: Double,
    val senha: Int,
    val plr: Double
) : Funcionario(nome = nome,cpf = cpf, salario = salario) {
    override fun bonificacao(): Double{
            return salario * 0.1 + salario + plr
        }

    fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }
}