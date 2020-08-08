package com.example.models.entities

import com.example.models.tables.RestProd
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class RestProds(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<RestProds>(RestProd)

    var restId by RestProd.restId
    var prodId by RestProd.prodId
}