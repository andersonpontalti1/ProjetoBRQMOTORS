package br.com.brq.ecc.brqmotors.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import br.com.brq.ecc.brqmotors.R
import br.com.brq.ecc.brqmotors.ui.privacy.PrivacyActivity

import kotlinx.android.synthetic.main.activity_main_login.*

class LoginActivity : AppCompatActivity() {

    private lateinit var viewModel: LoginActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_login)

        initializeViewModel()

        editTextEmail
        editTextPassword

        //-----açao transicao
        buttonLogin.setOnClickListener {
            val intent = Intent(baseContext, PrivacyActivity::class.java)
            startActivity(intent)
        }
    }

    private fun initializeViewModel() {
        viewModel = ViewModelProviders.of(this).get(LoginActivityViewModel::class.java)
    }
}