package br.com.brq.ecc.brqmotors.ui.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import br.com.brq.ecc.brqmotors.R
import br.com.brq.ecc.brqmotors.model.repository.UserRepository
import kotlinx.android.synthetic.main.activity_main_login.*

class LoginActivity : AppCompatActivity() {

    private lateinit var viewModel: LoginActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_login)

        initializeViewModel()

        //-----açao transicao
        buttonLogin.setOnClickListener {
//            val intent = Intent(baseContext, PrivacyActivity::class.java)
//            startActivity(intent)
            viewModel.verifyUserDate(editTextEmail.text.toString(),editTextPassword.text.toString())
        }
    }

    private fun initializeViewModel() {
        viewModel = ViewModelProviders.of(this, LoginActivityViewModelFactory(UserRepository(this)))
            .get(LoginActivityViewModel::class.java)
    }
}