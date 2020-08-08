package com.example.models.entities

import com.example.models.tables.Recipe
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class Recipes(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<Recipes>(Recipe)

    var description by Recipe.description
}