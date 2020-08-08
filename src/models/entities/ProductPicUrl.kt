package com.example.models.entities

import com.example.models.tables.ProductPicUrls
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class ProductPicUrl(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<ProductPicUrl>(ProductPicUrls)

    var prodId by ProductPicUrls.prodId
    var url by ProductPicUrls.url
}