package com.safetyapp.offlinefirst.data.di

import com.safetyapp.offlinefirst.data.remote.PupilApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


@InstallIn(SingletonComponent::class)
@Module
object DataModule {


    // https://pixabay.com/api/?key=50866224-7554b253077cd523dec958875&q=yellow+flowers&image_type=photo

    @Provides
    fun provideRetrofit():Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://androidtechnicaltestapi-test.bridgeinternationalacademies.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    fun apiService(retrofit:Retrofit):PupilApiService{
        return  retrofit.create(PupilApiService::class.java)
    }



}