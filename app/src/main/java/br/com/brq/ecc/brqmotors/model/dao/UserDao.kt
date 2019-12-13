package br.com.brq.ecc.brqmotors.model.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import br.com.brq.ecc.brqmotors.model.entities.User

@Dao
interface UserDao{
    @Query("SELECT * FROM user")
    fun all(): List<User>

    @Insert
    fun add (vararg user: User)

}
