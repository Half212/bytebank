package br.com.alura.bytebank.model

abstract class ContaTransferivel(
    titular : Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
){
     override fun transfere (valor:Double, destino : Conta): Boolean{
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}