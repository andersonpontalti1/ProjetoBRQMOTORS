package br.com.brq.ecc.brqmotors.ui.login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import br.com.brq.ecc.brqmotors.R
import br.com.brq.ecc.brqmotors.ui.privacy.PrivacyActivity
import kotlinx.android.synthetic.main.activity_main_login.*
import org.koin.android.viewmodel.ext.android.viewModel

class LoginActivity : AppCompatActivity() {

    private val viewModel: LoginActivityViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_login)

        viewModel.register()

        //-----açao transicao botao
        buttonLogin.setOnClickListener {
            viewModel.verifyUserData(editTextEmail.text.toString(), editTextPassword.text.toString())

        }

        viewModel.getUserExistLiveData().observe(this, Observer { userExist ->
            if (userExist) {
                val intent = Intent(applicationContext, PrivacyActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(applicationContext, "Usuário não encontrado", Toast.LENGTH_LONG)
                    .show()
            }
        })

        viewModel.getValidationTextLiveData().observe(this, Observer {validationText ->
            Toast.makeText(applicationContext, validationText, Toast.LENGTH_LONG).show()

        })

       }
    }
