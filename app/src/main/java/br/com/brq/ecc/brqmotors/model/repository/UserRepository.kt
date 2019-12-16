package br.com.brq.ecc.brqmotors.model.repository

import android.content.Context
import androidx.room.Room
import br.com.brq.ecc.brqmotors.model.database.AppDatabase

class UserRepository(context: Context) {

    private val database: AppDatabase by lazy {
        Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "brq-motors-database"
        ).build()
    }
    
    fun checkUserRegister(email: String, password: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}