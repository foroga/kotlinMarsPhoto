package com.example.marsphoto.data

import com.example.marsphoto.model.MarsPhoto
import com.example.marsphoto.network.MarsApiService

interface MarsPhotosRepository {
    suspend fun getMarsPhotos(): List<MarsPhoto>
}

class DefaultMarsPhotosRepository (
    private val marsApiService: MarsApiService
    ): MarsPhotosRepository {
    override suspend fun getMarsPhotos(): List<MarsPhoto> {
        return marsApiService.getPhotos()
    }
}