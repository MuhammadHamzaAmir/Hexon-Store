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
                if (allProducts.isNotEmpty()) {
                    products.addAll(allProducts)
                }

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
        try {
            val data = db.collection("products").document(category).collection("all")
                .get().await()
            if (!(data.isEmpty)) {
                data.forEach {
                    var product = it
                    var productData = product.data
                    productData["id"] = it.id
                    val brandNameReference: DocumentReference =
                        it.data["brand"] as DocumentReference
                    productData.remove("brand")
                    productData["brand"] = brandNameReference.id
                    productData["category"] = category


                    products.add(
                        Product(
                            productData["in stock"].toString().toLong(),
                            productData["price"].toString().toDouble(),
                            productData["product code"] as String,
                            productData["name"] as String,
                            productData["image link"] as String,
                            productData["id"] as String,
                            productData["category"] as String,
                            productData["brand"] as String,
                            productData["descp"] as String,
                        )
                    )
                }
            }
        } catch (e: Exception) {
            Log.d(TAG, "Error getting documents: ", e)
        }

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

private fun <E> MutableList<E>.add(element: Pair<MutableMap<String, Any>, Class<E>>) {
    element.first.entries.map { element.second.getConstructor(it.value::class.java).newInstance(it.value) }
}
