package com.example.models.entities

import com.example.models.tables.ProductPicUrl
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class ProductPicUrls(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<ProductPicUrls>(ProductPicUrl)

    var prodId by ProductPicUrl.prodId
    var url by ProductPicUrl.url
}