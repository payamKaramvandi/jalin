package com.example.models.tables

import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID
import org.jetbrains.exposed.dao.id.IntIdTable

object Ingredient: IntIdTable() {
    val name = varchar("name", 120)
    val description=varchar("descrioption",500)
}