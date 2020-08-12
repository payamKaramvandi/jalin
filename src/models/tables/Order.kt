package com.example.models.tables

import org.jetbrains.exposed.dao.id.IntIdTable

object Order : IntIdTable() {
    var orderDate = varchar("date", 12)
    var paymentType = varchar("paymentType", 12)
    var total = long("total")
    var status = varchar("status", 12)
}