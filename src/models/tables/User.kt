package com.example.models.tables

import org.jetbrains.exposed.sql.Table

/**
 *     Top abstract User class that each user type will implement respectively.
 */
abstract class User :Table() {
    val email = varchar("email", 320)
    val username = varchar("username", 320)
    val passwordHash = varchar("passwordHash", 64)
    val phoneNumber = varchar("phone_number", 13)
    val address = varchar("address", 286)
}