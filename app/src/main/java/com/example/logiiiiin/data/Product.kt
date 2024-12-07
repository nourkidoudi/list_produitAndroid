package com.example.logiiiiin.data

data class Product(
    val id: Long = 0,  // Default value for new products (which don't have an id yet)
    val name: String,
    val price: Double,
    val description: String,
    val imageUrl: Int
)
