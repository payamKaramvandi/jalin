package com.example.models.tables

import org.jetbrains.exposed.dao.id.IntIdTable

object OrderItem : IntIdTable() {
    val orderId = reference("orderId", Order)
    val productId = reference("productId", Product)
    val quantity = integer("quantity")
}
