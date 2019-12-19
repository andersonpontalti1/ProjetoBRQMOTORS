package br.com.brq.ecc.brqmotors.model.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import br.com.brq.ecc.brqmotors.model.entities.User

@Dao
interface UserDao {
    @Query("SELECT * FROM user WHERE user = :email AND password = :password")
    fun getUserByEmailAndPassword(email: String, password: String): User

    @Insert
    fun add(vararg user: User)

    @Query("SELECT * FROM User")
    fun getAllUser():List<User>

}
