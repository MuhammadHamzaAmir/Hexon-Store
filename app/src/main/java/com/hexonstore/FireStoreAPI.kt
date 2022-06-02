package com.hexonstore

import android.util.Log
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.tasks.await

private const val TAG ="Firestore"
class FireStoreAPI: Products {

    private val db = Firebase.firestore

    override suspend fun getProducts(): List<Product> {
        val products = mutableListOf<Product>()
        val productsName = mutableListOf<String>()
        try {
            val data = db.collection("products")
                .get().await()
            data.forEach {
                productsName.add(it.id)
                //products.add(it.toObject(Product::class.java))
            }
        }
        catch (e: Exception) {
            Log.d(TAG, "Error getting documents: ", e)
        }
        Log.d(TAG,"Products Names List $productsName")
        return products
    }

    override fun getProduct(id: String): Product {
        TODO("Not yet implemented")
    }

    override fun addProduct(product: Product) {
        TODO("Not yet implemented")
    }

    override fun updateProduct(product: Product) {
        TODO("Not yet implemented")
    }

    override fun deleteProduct(id: String) {
        TODO("Not yet implemented")
    }

    override fun getProductsByCategory(category: String): List<Product> {
        TODO("Not yet implemented")
    }

    override fun getProductsByCategory(category: String, page: Int, pageSize: Int): List<Product> {
        TODO("Not yet implemented")
    }

    override fun getProductsByBrand(brand: String): List<Product> {
        TODO("Not yet implemented")
    }

    override fun getProductsByBrand(brand: String, page: Int, pageSize: Int): List<Product> {
        TODO("Not yet implemented")
    }

}