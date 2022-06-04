package com.hexonstore

import android.util.Log
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.tasks.await

private const val TAG = "Firestore"

class FireStoreAPI : Products {

    private val db = Firebase.firestore

    override suspend fun getProducts(): List<Product> {
        val products = mutableListOf<Product>()
        val productsCategoryName = mutableListOf<String>()
        try {
            val data = db.collection("products")
                .get().await()
            data.forEach {
                productsCategoryName.add(it.id)
                val allProducts = getProductsByCategory(it.id)
                Log.d(TAG, "Products: $allProducts")
                //products.add(it.toObject(Product::class.java))
            }
        } catch (e: Exception) {
            Log.d(TAG, "Error getting documents: ", e)
        }
        Log.d(TAG, "Products Category List $productsCategoryName")

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

    override suspend fun getProductsByCategory(category: String): List<Product> {
        val products = mutableListOf<Product>()
        val productsName = mutableListOf<String>()
        try {
            val data = db.collection("products").document(category).collection("all")
                .get().await()
            data.forEach {
                val brandNameReference:DocumentReference = it.data["brand"] as DocumentReference
                val brandName = db.collection("brands").document(brandNameReference.toString())
                    .get().await()
                Log.d(TAG, "Product brand ${brandName.id} ==> ${brandNameReference.id}")

//                productsName.add(it.id)
//                Log.d(TAG, "Product Name ${it.id} ==> ${it.data}")
                //products.add(it.toObject(Product::class.java))
            }
        } catch (e: Exception) {
            Log.d(TAG, "Error getting documents: ", e)
        }
        Log.d(TAG, "Products Names List $productsName")

        return products
    }

    override fun getProductsByCategory(category: String, page: Int, pageSize: Int): List<Product> {
        TODO("Not yet implemented")
    }

    override suspend fun getProductsByBrand(brand: String): List<Product> {
        TODO("Not yet implemented")
    }

    override fun getProductsByBrand(brand: String, page: Int, pageSize: Int): List<Product> {
        TODO("Not yet implemented")
    }

}