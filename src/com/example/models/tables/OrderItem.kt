package com.example.com.example.models.tables

import com.example.models.tables.Order
import com.example.models.tables.Product
import org.jetbrains.exposed.dao.id.IntIdTable

object OrderItem : IntIdTable() {
    val orderId=reference("orderId",Order)
    val productId = reference("productId", Product)
    val quantity=integer("quantity")
}
