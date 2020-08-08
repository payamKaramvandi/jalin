package com.example.models.tables

import org.jetbrains.exposed.dao.id.IntIdTable

object Product : IntIdTable() {
    val name = varchar("name", length = 128)
    val fee = long("fee")
    val description = varchar("description", 500)
}