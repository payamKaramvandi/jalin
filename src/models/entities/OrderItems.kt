package com.example.models.entities

import com.example.com.example.models.tables.OrderItem
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID


class OrderItems(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<OrderItems>(OrderItem)
    var orderId by OrderItem.orderId
    var productId by OrderItem.productId
    var quantity by OrderItem.quantity

}