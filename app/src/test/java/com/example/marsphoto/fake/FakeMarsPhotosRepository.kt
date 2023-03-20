package com.example.marsphoto.fake

import com.example.marsphoto.data.MarsPhotosRepository
import com.example.marsphoto.model.MarsPhoto

class FakeMarsPhotosRepository: MarsPhotosRepository {
    override suspend fun getMarsPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }
}