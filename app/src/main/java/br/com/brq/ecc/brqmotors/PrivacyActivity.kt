package br.com.brq.ecc.brqmotors

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.brq.ecc.brqmotors.R.drawable.background_buttonpriva_desat
import kotlinx.android.synthetic.main.activity_main_privacidade.*

class PrivacyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_privacidade)
        initButtonOff()
        swithActivityButton()
    }
    private fun swithActivityButton() {
        switch1.setOnClickListener {
            val isLocaleChecked = switch1.isChecked
            button.isEnabled = isLocaleChecked

            if (isLocaleChecked) {

                button.background = getDrawable(R.drawable.background_buttonpriva)

            } else {
                button.background = getDrawable(background_buttonpriva_desat)

            }
        }
    }
    private fun initButtonOff() {
        button.isEnabled = false
        button.background = getDrawable(background_buttonpriva_desat)
    }
}