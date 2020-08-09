package com.example.models.entities

import com.example.models.tables.RecipeIngrd
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class RecipeIngrds(id: EntityID<Int>) : IntEntity(id) {
    companion object :IntEntityClass<RecipeIngrds>(RecipeIngrd)

    var recipeId by RecipeIngrd.recipeId
    var ingredientId by RecipeIngrd.ingredId
    var quantity by RecipeIngrd.quantity

}