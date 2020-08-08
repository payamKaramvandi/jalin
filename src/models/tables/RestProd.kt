package com.example.models.tables

import org.jetbrains.exposed.dao.id.IntIdTable

object RestProd : IntIdTable() {
    val restId = reference("restaurant", Restaurant)
    val prodId = reference("restaurant", Product)
    override val primaryKey: PrimaryKey
        get() = PrimaryKey(restId, prodId,name = "RestProd_id")
}
