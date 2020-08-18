package com.example.repository

import com.example.models.UserModel

class StoreRepository : Repository {
    override suspend fun addUser(email: String, displayName: String, passwordHash: String): UserModel? {
        TODO("Not yet implemented")
    }

    override suspend fun findUser(userId: Int): UserModel? {
        TODO("Not yet implemented")
    }

    override suspend fun findUserByEmail(email: String): UserModel? {
        TODO("Not yet implemented")
    }

}