package com.example.models.entities

import com.example.models.tables.Customer
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class Customers(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<Customers>(Customer)
    var cardNumber by Customer.cardNumber
}