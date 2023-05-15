class SistemaInterno {
    fun entra(admin: FuncionarioAdmin, senha: Int){
        if(admin.autentica(senha)){
            println("Bem vindo ao bytebank")
        }else{
            println("falha na autenticação")
        }


    }

}