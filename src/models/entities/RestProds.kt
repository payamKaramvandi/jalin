package com.example.models.entities

import com.example.models.tables.RestHaveProd
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class RestProds(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<RestProds>(RestHaveProd)

    var restId by RestHaveProd.restId
    var prodId by RestHaveProd.prodId
}