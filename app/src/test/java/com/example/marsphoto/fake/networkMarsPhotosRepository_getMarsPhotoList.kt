package com.example.marsphoto.fake

import com.example.marsphoto.data.DefaultMarsPhotosRepository
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Test


@OptIn(ExperimentalCoroutinesApi::class)
class networkMarsPhotosRepository_getMarsPhotoList() {

    @Test
    fun  networkMarsPhotosRepository_getMarsPhotoList() =
        runTest {
            val repository = DefaultMarsPhotosRepository(
                marsApiService = FakeMarsApiService()
            )
            assertEquals(FakeDataSource.photosList, repository.getMarsPhotos())
    }
}

