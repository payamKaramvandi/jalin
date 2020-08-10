package com.example.models.entities

import com.example.models.tables.Order
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID


class Orders(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<Orders>(Order)

    var customerId by Order.customerId
    var orderDate by Order.orderDate
    var paymentType by Order.paymentType
    var total by Order.total
    var status by Order.status
}