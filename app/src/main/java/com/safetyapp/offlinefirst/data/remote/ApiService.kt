package com.safetyapp.offlinefirst.data.remote

import com.safetyapp.offlinefirst.data.model.remote.PupilDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface PupilApiService{

    @GET("/api")
    suspend fun getPupils(
        @Query("page") page: Int,
    ): Response<PupilDto>

}