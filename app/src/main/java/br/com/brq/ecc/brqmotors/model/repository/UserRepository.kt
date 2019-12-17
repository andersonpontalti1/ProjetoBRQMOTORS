package br.com.brq.ecc.brqmotors.model.repository

import br.com.brq.ecc.brqmotors.model.dao.UserDao

class UserRepository(val userDao: UserDao) {
    
    fun checkUserRegister(email: String, password: String) {
        
        userDao.all()
    }

}