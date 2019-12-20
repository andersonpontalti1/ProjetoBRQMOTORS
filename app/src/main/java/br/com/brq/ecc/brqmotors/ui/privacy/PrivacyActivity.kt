package br.com.brq.ecc.brqmotors.ui.privacy

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.brq.ecc.brqmotors.OnboardingActivity
import br.com.brq.ecc.brqmotors.R
import br.com.brq.ecc.brqmotors.R.drawable.background_buttonpriva_desabled
import kotlinx.android.synthetic.main.activity_main_privacidade.*

class PrivacyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_privacidade)
        //initButtonOff()
        swithActivityButton()
        setupReadMoreListener()

    }

    private fun setupReadMoreListener() {
        redemore_blue.setOnClickListener {
            startReadMoreIntent()
        }
        redemore_purple.setOnClickListener { startReadMoreIntent() }
    }

    private fun startReadMoreIntent() {
        val url = "http://www.brq.com/"
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }// açao do botao swith

    private fun setupBtnContinue() {
        buttonprivacy.setOnClickListener {
            startActivity(Intent(this, OnboardingActivity::class.java))

        }

    }

    private fun swithActivityButton() {
        switch1.setOnClickListener {
            val isLocaleChecked = switch1.isChecked
            buttonprivacy.isEnabled = isLocaleChecked

            if (isLocaleChecked) {

                buttonprivacy.background = getDrawable(R.drawable.background_buttonpriva)
                setupBtnContinue()

            } else {
                buttonprivacy.background = getDrawable(background_buttonpriva_desabled)

            }
        }
    }

    private fun initButtonOff() {
        buttonprivacy.isEnabled = false
        buttonprivacy.background = getDrawable(background_buttonpriva_desabled)
    }
}