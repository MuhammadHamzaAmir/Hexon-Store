package com.hexonstore

import android.util.Log
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

private const val TAG = "Firestore"
class Firestore {

    private val db =  Firebase.firestore

//    fun getAllMotherboards(brand:String) : List<Motherboard> {
//        val motherboardList = mutableListOf<Motherboard>()
//        db.collection("products").document("Motherboard").collection(brand).get()
//            .addOnSuccessListener { documents ->
//                for (document in documents) {
//                    Log.d(TAG, "${document.id} => ${document.data}")
//                    motherboardList.add(Motherboard(document.id, document.data))
//                }
//            }
//            .addOnFailureListener { exception ->
//                Log.w(TAG, "Error getting documents.", exception)
//            }
//        return motherboardList
//    }




}