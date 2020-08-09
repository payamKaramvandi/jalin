package com.example.models.entities

import com.example.models.tables.Ingredient
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class Ingredients(id: EntityID<Int>): IntEntity(id){
    companion object : IntEntityClass<Ingredients>(Ingredient)
    var name by Ingredient.name
    var description by Ingredient.description
}