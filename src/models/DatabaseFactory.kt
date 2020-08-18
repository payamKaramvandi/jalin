package com.example.models

import com.example.models.entities.Customers
import com.example.models.tables.*
import com.example.models.tables.Product
import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.transactions.transaction

object DatabaseFactory {
    fun init() {
        Database.connect(hikari())
        //initializing tables
        transaction {
            SchemaUtils.create(
                Customer,
                Order,
                Product,
                Restaurant,
                RestHaveProd,
                CustomerMakeOrder,
                Ingredient,
                OrderItem,
                ProdRecipeUser,
                ProductPicUrl,
                Recipe,
                RecipeIngrd,
                RestaurantPicUrl
            )
        }
    }

    private fun hikari(): HikariDataSource {
        val config = HikariConfig()
        config.driverClassName = System.getenv("JDBC_DRIVER")
        config.jdbcUrl = System.getenv("JDBC_DATABASE_URL")
        config.maximumPoolSize = 3
        config.isAutoCommit = false
        config.transactionIsolation = "TRANSACTION_REPEATABLE_READ"

        config.username = System.getenv("DB_USER") ?: ""
        config.password = System.getenv("DB_PASSWORD") ?: ""
        config.validate()
        return HikariDataSource(config)
    }

    suspend fun <T> dbQuery(blockToPass: () -> T): T =
        withContext(Dispatchers.IO) {
            transaction { blockToPass() }
        }
}