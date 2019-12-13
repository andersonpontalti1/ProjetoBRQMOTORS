package br.com.brq.ecc.brqmotors.model.database

import androidx.room.Database
import androidx.room.RoomDatabase
import br.com.brq.ecc.brqmotors.model.dao.UserDao
import br.com.brq.ecc.brqmotors.model.entities.User

@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
   abstract fun userDao(): UserDao

}
