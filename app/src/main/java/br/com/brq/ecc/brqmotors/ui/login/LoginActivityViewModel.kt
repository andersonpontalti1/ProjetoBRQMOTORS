package br.com.brq.ecc.brqmotors.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.brq.ecc.brqmotors.model.repository.UserRepository
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

class LoginActivityViewModel(val repository: UserRepository) : ViewModel(), CoroutineScope {
    // Coroutine's background job
    private val job = Job()
    // Define default thread for Coroutine as Main and add job
    override val coroutineContext: CoroutineContext = job + Dispatchers.Main

    private val userExists = MutableLiveData<Boolean>()
    private val validationText = MutableLiveData<String>()

    fun register() {
        launch {
            withContext(Dispatchers.IO) {
                repository.registerUser()
            }
        }
    }

    fun verifyUserData(email: String, password: String) {

        val validation = validateUserData(email, password)

        if (validation.isEmpty()) {
            launch {
                val userIsVerifyData = withContext(Dispatchers.IO) {
                    repository.checkUserRegister(email, password)
                }
                userExists.postValue(userIsVerifyData)
            }
        } else {
                validationText.postValue(validation)

        }

    }

    fun getUserExistLiveData(): LiveData<Boolean> {
        return userExists
    }

    fun getValidationTextLiveData(): LiveData<String> {
        return validationText
    }

    private fun validateUserData(email: String, password: String): String {
        return CheckFields()
            .checkFieldsLoginUser(
                email,
                password
            )
    }
}

























