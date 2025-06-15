package com.safetyapp.offlinefirst.data.model.remote

data class PupilDto(
    val itemCount: Int,
    val items: List<ItemDto>,
    val pageNumber: Int,
    val totalPages: Int
)