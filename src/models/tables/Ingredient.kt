package com.example.models.tables

import org.jetbrains.exposed.dao.id.IntIdTable

object Ingredient: IntIdTable() {
    val name = varchar("name", 50)
    val description=varchar("descrioption",500)
    val unit = varchar("unit", 50)
}