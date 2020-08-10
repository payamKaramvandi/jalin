package com.example.models.tables

import org.jetbrains.exposed.dao.id.IntIdTable
import org.jetbrains.exposed.sql.Column

object RestaurantPicUrl : IntIdTable() {
    val prodId: Column<Int> = integer("id").references(Restaurant.id)
    val url = varchar("url", 255)
}
