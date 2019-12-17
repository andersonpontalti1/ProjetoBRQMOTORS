package br.com.brq.ecc.brqmotors.module

import androidx.room.Room
import br.com.brq.ecc.brqmotors.model.database.AppDatabase
import br.com.brq.ecc.brqmotors.model.repository.UserRepository
import br.com.brq.ecc.brqmotors.ui.login.LoginActivityViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModules = module {

    single {
        Room.databaseBuilder(
            androidContext(),
            AppDatabase::class.java,
            "brq-motors-database"
        ).build()
    }

    single { get<AppDatabase>().userDao() }

    single { UserRepository(userDao = get()) }

    viewModel { LoginActivityViewModel(repository = get()) }
}
