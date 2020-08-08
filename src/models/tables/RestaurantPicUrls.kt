package com.example.models.tables

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

object RestaurantPicUrls : Table() {
    val prodId: Column<Int> = integer("id").references(Restaurant.id)
    val url = varchar("url", 255)
}
