package com.example.models.entities

import com.example.models.tables.RestHaveProd
import com.example.models.tables.Restaurant
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class Restaurants(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<Restaurants>(Restaurant)
    var name by Restaurant.name
    var address by Restaurant.address
    var products by Products via RestHaveProd
}