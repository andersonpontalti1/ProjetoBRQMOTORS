package br.com.brq.ecc.brqmotors.ui.login

import androidx.lifecycle.ViewModel
import br.com.brq.ecc.brqmotors.model.repository.UserRepository

class LoginActivityViewModel(val repository: UserRepository): ViewModel() {

    fun initializeDatabase(){

    }

    fun verifyUserDate(email: String, password: String) {
        if(userInputIsValid(email, password)){

            repository.checkUserRegister(email, password)
        }
    }

    //TODO("Anderson vai fazer depois")
    private fun userInputIsValid(email: String, password: String): Boolean {
        return true
    }
}