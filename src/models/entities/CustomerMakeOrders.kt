package com.example.models.entities

import com.example.models.tables.CustomerMakeOrder
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class CustomerMakeOrders(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<CustomerMakeOrders>(CustomerMakeOrder)
    var customerId by CustomerMakeOrder.customerId
    var orderId by CustomerMakeOrder.orderId
}