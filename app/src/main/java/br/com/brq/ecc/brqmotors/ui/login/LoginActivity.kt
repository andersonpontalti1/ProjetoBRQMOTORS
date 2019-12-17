package br.com.brq.ecc.brqmotors.ui.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.brq.ecc.brqmotors.R
import kotlinx.android.synthetic.main.activity_main_login.*
import org.koin.android.viewmodel.ext.android.viewModel

class LoginActivity : AppCompatActivity() {

    private val viewModel: LoginActivityViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_login)

        //-----açao transicao
        buttonLogin.setOnClickListener {
            //            val intent = Intent(baseContext, PrivacyActivity::class.java)
//            startActivity(intent)
            viewModel.verifyUserData(
                editTextEmail.text.toString(),
                editTextPassword.text.toString()
            )
        }
    }
}
