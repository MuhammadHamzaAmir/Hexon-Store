package com.hexonstore

interface Products {

    fun getProducts(): List<Product>
    fun getProduct(id: String): Product
    fun addProduct(product: Product)
    fun updateProduct(product: Product)
    fun deleteProduct(id: String)
    fun getProductsByCategory(category: String): List<Product>
    fun getProductsByCategory(category: String, page: Int, pageSize: Int): List<Product>
    fun getProductsByBrand(brand: String): List<Product>
    fun getProductsByBrand(brand: String, page: Int, pageSize: Int): List<Product>
    
}