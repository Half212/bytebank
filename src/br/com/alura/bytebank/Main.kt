import br.com.alura.bytebank.model.Endereco
import br.com.alura.bytebank.test.testaFuncionarios

fun main() {
    val endereco = Endereco(logradouro = "Rua vergueiro", complemento = "Alura")
    val enderecoNovo = Endereco(bairro = "Vila Mariana", numero = 1000)

    println(endereco.equals(endereco))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco)
    println(enderecoNovo)

    println("${endereco.javaClass}@${
        Integer.toHexString(endereco.hashCode())}")
}
fun imprime(valor: Any): Any {
    println(valor)
    return valor
}











