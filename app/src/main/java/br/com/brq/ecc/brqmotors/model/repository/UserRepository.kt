package br.com.brq.ecc.brqmotors.model.repository

import br.com.brq.ecc.brqmotors.model.dao.UserDao
import br.com.brq.ecc.brqmotors.model.entities.User

class UserRepository(val userDao: UserDao) {

    fun checkUserRegister(email: String, password: String) : Boolean{
            val result:User? = userDao.getUserByEmailAndPassword(email, password)
            result?.let {
                return true
            }
            return false
    }

    fun registerUser() {
        val allUser: List<User> = userDao.getAllUser()
        if(allUser.isEmpty()){
            userDao.add(User(1, "andersonpontalti@brq.com", "admin"))
        }
    }

}