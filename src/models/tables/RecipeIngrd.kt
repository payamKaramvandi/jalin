package com.example.models.tables

import org.jetbrains.exposed.dao.id.IntIdTable

object RecipeIngrd : IntIdTable() {
    val recipeId = reference("recipeId", Recipe)
    val ingredId = reference("ingredientId", Ingredient)
    val quantity = varchar("quantity", 50)
}