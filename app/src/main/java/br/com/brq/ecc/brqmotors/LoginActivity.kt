package br.com.brq.ecc.brqmotors


import android.app.Dialog
import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_login)

        buttonLogin.setOnClickListener {
            val intent = Intent(baseContext, PrivacidadeActivity::class.java)
            startActivity(intent)
        }

    }
}








