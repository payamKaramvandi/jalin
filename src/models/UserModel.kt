package com.example.models

data class UserModel(
    val email: String,
    val username: String,
    val passwordHash :String,
    val phoneNumber :String,
    val address :String
)