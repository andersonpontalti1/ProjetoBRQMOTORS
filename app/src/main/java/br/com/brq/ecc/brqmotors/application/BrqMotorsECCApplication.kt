package br.com.brq.ecc.brqmotors.application

import android.app.Application
import br.com.brq.ecc.brqmotors.module.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class BrqMotorsECCApplication: Application() {
    override fun onCreate() {
        super.onCreate()
            startKoin { androidContext(this@BrqMotorsECCApplication)
            modules(appModules)}
    }

}