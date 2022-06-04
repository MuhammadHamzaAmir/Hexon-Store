package com.hexonstore

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

//private const val TAG = "Product"
@Serializable
data class Product(
    @SerialName("product code")
    val productCode: String,
    @SerialName("price")
    val price: Double,
    @SerialName("name")
    val name: String,
    @SerialName("in stock")
    val quantity: Int,
    @SerialName("image link")
    val image: String,
    @SerialName("descp")
    val description: String,
    @SerialName("brand")
    val brand: String,
    @SerialName("category")
    val category: String,
    @SerialName("id")
    val id: String
)
//class Product()  {
//    lateinit var id: String     // 'document id'
//    lateinit var productCode: String     // 'product code'
//    lateinit var name: String
//    private var price: Double = 0.0
//    var description: String = name       // product description ('descp')
//    var image: String = ""          // product 'image link'
//    lateinit var category: String   // product type
//    var brand: String = ""          // product 'brand'
//    private var quantity: Int = 0       // product 'in stock'
//
//    constructor(
//        id: String,
//        productCode: String,
//        name: String,
//        price: Double,
//        description: String,
//        image: String,
//        category: String,
//        brand: String,
//        quantity: Int
//    ) : this() {
//        this.id = id
//        this.name = name
//        this.price = price
//        this.description = description
//        this.image = image
//        this.category = category
//        this.brand = brand
//        this.quantity = quantity
//        this.productCode = productCode
//    }
//
//    constructor(
//        id: String,
//        productCode: String,
//        name: String,
//        price: Double,
//        description: String,
//        image: String,
//        category: String,
//        brand: String
//    ) : this() {
//        this.id = id
//        this.name = name
//        this.price = price
//        this.description = description
//        this.image = image
//        this.category = category
//        this.brand = brand
//        this.productCode = productCode
//    }
//
//    constructor(
//        id: String,
//        name: String,
//        productCode: String,
//        description: String,
//        image: String,
//        category: String,
//        brand: String,
//        quantity: Int
//    ) : this() {
//        this.id = id
//        this.name = name
//        this.description = description
//        this.image = image
//        this.category = category
//        this.brand = brand
//        this.quantity = quantity
//        this.productCode= productCode
//    }
//
//    constructor(
//        id: String,
//        name: String,
//        productCode: String,
//        price: Double,
//        image: String,
//        category: String,
//        brand: String,
//        quantity: Int
//    ) : this() {
//        this.id = id
//        this.name = name
//        this.price = price
//        this.image = image
//        this.category = category
//        this.brand = brand
//        this.quantity = quantity
//        this.productCode = productCode
//    }
//
//    fun getQuantity():Int {
//        return this.quantity
//    }
//    fun setQuantity(quantity: Int) {
//        this.quantity = quantity
//    }
//
//    fun getPrice():Double {
//        return this.price
//    }
//    fun setPrice(price: Double) {
//        this.price = price
//    }
//
//}