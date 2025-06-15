package com.safetyapp.offlinefirst.domain.data

import com.safetyapp.offlinefirst.data.model.remote.ItemDto

data class Pupil(
    val itemCount: Int,
    val items: List<ItemDto>,
    val pageNumber: Int,
    val totalPages: Int
)