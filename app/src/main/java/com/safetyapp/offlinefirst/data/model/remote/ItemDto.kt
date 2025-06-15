package com.safetyapp.offlinefirst.data.model.remote

data class ItemDto(
    val country: String,
    val image: String,
    val latitude: Double,
    val longitude: Double,
    val name: String,
    val pupilId: Int
)