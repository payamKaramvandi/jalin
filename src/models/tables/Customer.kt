package com.example.models.tables

object Customer : User() {
    val cardNumber = varchar("card_number", 16)

}