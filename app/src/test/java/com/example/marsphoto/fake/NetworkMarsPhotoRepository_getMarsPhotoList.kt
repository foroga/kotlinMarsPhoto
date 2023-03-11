package com.example.marsphoto

import com.example.marsphoto.data.DefaultMarsPhotosRepository
import com.example.marsphoto.fake.FakeDataSource
import com.example.marsphoto.fake.FakeMarsApiService
import junit.framework.TestCase
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
            TestCase.assertEquals(FakeDataSource.photosList, repository.getMarsPhotos())
        }
}

