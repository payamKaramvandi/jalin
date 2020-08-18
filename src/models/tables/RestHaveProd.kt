package com.example.models.tables

import org.jetbrains.exposed.dao.id.IntIdTable

object RestHaveProd : IntIdTable() {
    val restId = reference("restaurant", Restaurant).uniqueIndex()
    val prodId = reference("product", Product).uniqueIndex()
    override val primaryKey: PrimaryKey
        get() = PrimaryKey(restId, prodId,name = "RestProd_id")
}
