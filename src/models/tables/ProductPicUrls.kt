package com.example.models.tables

import org.jetbrains.exposed.dao.id.IntIdTable

object ProductPicUrls : IntIdTable() {
    val prodId=reference("prodId",Product)
    val url = varchar("url", 255)
}
