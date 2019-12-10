package br.com.brq.ecc.brqmotors

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.brq.ecc.brqmotors.R.drawable.background_buttonpriva_desabled
import kotlinx.android.synthetic.main.activity_main_privacidade.*

class PrivacyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_privacidade)
        initButtonOff()
        swithActivityButton()
    }// açao do botao swith
    private fun swithActivityButton() {
        switch1.setOnClickListener {
            val isLocaleChecked = switch1.isChecked
            button.isEnabled = isLocaleChecked

            if (isLocaleChecked) {

                button.background = getDrawable(R.drawable.background_buttonpriva)

            } else {
                button.background = getDrawable(background_buttonpriva_desabled)

            }
        }
    }
    private fun initButtonOff() {
        button.isEnabled = false
        button.background = getDrawable(background_buttonpriva_desabled)
    }
}