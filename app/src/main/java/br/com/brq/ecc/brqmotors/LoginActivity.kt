package br.com.brq.ecc.brqmotors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_main_login.*

class LoginActivity : AppCompatActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_login)
        //açao transicao
        buttonLogin.setOnClickListener {
            val intent = Intent(baseContext, PrivacyActivity::class.java)
            startActivity(intent)
        }

    }
}

