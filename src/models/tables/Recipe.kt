package com.example.models.tables

import org.jetbrains.exposed.dao.id.IntIdTable

object Recipe : IntIdTable() {
    val description = varchar("description", 1000)
}
