package com.hexonstore

import com.google.firebase.firestore.DocumentReference
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

//private const val TAG = "Product"
@Serializable
data class Product(
    @SerialName("in stock")
    val quantity: Long,
    @SerialName("price")
    val price: Double,
    @SerialName("product code")
    val productCode: String,
    @SerialName("name")
    val name: String,
    @SerialName("image link")
    val image: String,
    @SerialName("id")
    val id: String,
    @SerialName("category")
    val category: String,
    @SerialName("brand")
    val brand: String,
    @SerialName("descp")
    val description: String,



)
//class Product()  {
//    lateinit var id: String     // 'document id'
//    lateinit var productCode: String     // 'product code'
//    lateinit var name: String
//    private var price: Double = 0.0
//    lateinit var description: String    // product description ('descp')
//    var image: String = ""          // product 'image link'
//    lateinit var category: String   // product type
//    lateinit var brand: DocumentReference        // product 'brand'
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
//        brand: DocumentReference,
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
//        brand: DocumentReference
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
//        brand: DocumentReference,
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
//        name: String,
//        productCode: String,
//        description: String,
//        image: String,
//        price: Double,
//        brand: DocumentReference,
//        quantity: Int
//    ) : this() {
//        this.price = price
//        this.name = name
//        this.description = description
//        this.image = image
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
//        brand: DocumentReference,
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
//    @JvmName("getId1")
//    fun getId():String {
//        return this.id
//    }
//    @JvmName("getProductCode1")
//    fun getProductCode():String {
//        return this.productCode
//    }
//
//    override fun toString(): String {
//        return "Product name='$name', price=$price)"
//    }
//
//}