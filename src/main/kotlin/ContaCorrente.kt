class ContaCorrente(
    titular: String,
    numero: Int
) : ContaTransferivel(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        var valorComTaxa = valor + 0.1
        if (this.saldo>= valorComTaxa){
            this.saldo-=valorComTaxa
        }
    }
}
