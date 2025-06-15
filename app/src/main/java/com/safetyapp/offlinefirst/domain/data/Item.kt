package com.safetyapp.offlinefirst.domain.data

data class Item(
    val country: String,
    val image: String,
    val latitude: Double,
    val longitude: Double,
    val name: String,
    val pupilId: Int
)