package com.example.models.tables

import org.jetbrains.exposed.dao.id.IntIdTable

object Restaurant : IntIdTable() {
    val name = varchar("name", 255)
    val address = varchar("address", 500)
    val acceptRecipe= bool("acceptRecipe")
}

