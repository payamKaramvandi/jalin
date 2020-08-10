package com.example.models.tables

import org.jetbrains.exposed.dao.id.IntIdTable

object ProdRecipeUser : IntIdTable() {
    val productId = reference("productId", Product)
    val recipeId = reference("recipeId", Recipe)
    val customerId=reference("customerId",Customer)
}