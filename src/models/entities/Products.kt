package com.example.models.entities

import com.example.models.tables.Product
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class Products(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<Products>(Product)
    var name by Product.name
    var fee by Product.fee
    var description by Product.description
}