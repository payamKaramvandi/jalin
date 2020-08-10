package com.example.models.entities

import com.example.models.tables.RestaurantPicUrl
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class RestPicUrls(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<RestPicUrls>(RestaurantPicUrl)

    var prodId by RestaurantPicUrl.prodId
    var url by RestaurantPicUrl.url
}