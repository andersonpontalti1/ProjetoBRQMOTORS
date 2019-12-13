package br.com.brq.ecc.brqmotors.model.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class User(
    @PrimaryKey
    val id: Long,
    val user: String,
    val password: String
)