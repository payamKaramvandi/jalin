package com.example.models.entities

import com.example.models.tables.ProdRecipeUser
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class ProdRecipeUsers(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<ProdRecipeUsers>(ProdRecipeUser)

    var productId by ProdRecipeUser.productId
    var receipeId by ProdRecipeUser.recipeId
    var customerId by ProdRecipeUser.customerId
}