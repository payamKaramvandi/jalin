package com.example.models.tables

import org.jetbrains.exposed.dao.id.IntIdTable

object CustomerMakeOrder : IntIdTable() {
    val customerId = reference("customerId", Customer)
    val orderId = reference("orderId", Order)
    override val primaryKey: PrimaryKey
        get() = PrimaryKey(customerId, orderId)
}