package com.example.repository

import com.example.models.UserModel

interface Repository {
    suspend fun addUser(email: String,
                        displayName: String,
                        passwordHash: String): UserModel?
    suspend fun findUser(userId: Int): UserModel?
    suspend fun findUserByEmail(email: String): UserModel?
}