package com.example.marsphoto.data

import com.example.marsphoto.model.MarsPhoto
import com.example.marsphoto.network.MarsApi

interface MarsPhotosRepository {
    suspend fun getMarsPhotos(): List<MarsPhoto>
}

class DefaultMarsPhotosRepository: MarsPhotosRepository {
    override suspend fun getMarsPhotos(): List<MarsPhoto> {
        return MarsApi.retrofitService.getPhotos()
    }
}