package com.safetyapp.offlinefirst.data.mappers

interface Mappers<F,T> {

    fun MapInput(input:F):T

}


fun <F, T> Mappers<F,T>.MapAll(list:List<F>) = list.map { MapInput(it) }