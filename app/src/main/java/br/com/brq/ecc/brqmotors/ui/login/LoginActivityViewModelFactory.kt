package br.com.brq.ecc.brqmotors.ui.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import br.com.brq.ecc.brqmotors.model.repository.UserRepository

class LoginActivityViewModelFactory(private val repository: UserRepository) :
    ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return LoginActivityViewModel(repository) as T
    }
}