package br.com.brq.ecc.brqmotors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main_privacidade.*

class PrivacyActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_privacidade)
        switch1.setOnClickListener {
            var isLocaleChecked = switch1.isChecked
            button.isEnabled = isLocaleChecked
            if (isLocaleChecked) {
                Toast.makeText(baseContext, "Habilitado", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(baseContext, "Desabilitado", Toast.LENGTH_LONG).show()
            }
        }
    }
}
