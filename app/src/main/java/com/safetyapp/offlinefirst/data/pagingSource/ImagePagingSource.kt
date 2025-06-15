//package com.safetyapp.offlinefirst.data.pagingSource
//
//import androidx.paging.Pager
//import androidx.paging.PagingSource
//import androidx.paging.PagingState
//import com.safetyapp.offlinefirst.data.mappers.ImageDtoImageMapper
//import com.safetyapp.offlinefirst.data.remote.ApiService
//import com.safetyapp.offlinefirst.domain.data.Image
//import javax.inject.Inject
//
//class ImagePagingSource @Inject constructor(
//    private val ApiService:ApiService,
//    private val  q:String,
//    private val mapper: ImageDtoImageMapper
//) : PagingSource<Int, Image>() {
//    override fun getRefreshKey(state: PagingState<Int, Image>): Int? {
//        TODO("Not yet implemented")
//    }
//
//    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Image> {
//        val page = params.key ?:  1
//        val size = params.loadSize
//
//        try {
//            ApiService.getImages(query = q, page = page)
//        }catch (e:Exception){
//
//        }
//    }
//}