package com.example.marsphoto.network

import com.example.marsphoto.model.MarsPhoto
import retrofit2.http.GET

interface MarsApiService {
    @GET("photos")
    suspend fun getPhotos(): List<MarsPhoto>
}
