package com.example.models

import io.ktor.auth.Principal
import java.io.Serializable

data class Product(
        val id: Int,
        val name: String,
        val fee: Long,
        val description:String
):Serializable,Principal