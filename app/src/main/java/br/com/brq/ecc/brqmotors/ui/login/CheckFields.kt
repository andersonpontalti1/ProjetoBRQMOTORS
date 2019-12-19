package br.com.brq.ecc.brqmotors.ui.login

class CheckFields {

    fun checkFieldsLoginUser(email:String,password:String) :String{
        if(email=="" && password == ""){
            return "Campos inválidos!"
        }else if(email =="" && password!= ""){
           return "Email é obrigatório!"
        }else if( email !="" && password == ""){
            return "Senha é obrigatório!"
        }else{
            return ""
        }
    }
}