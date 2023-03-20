package com.example.marsphoto.fake

import com.example.marsphoto.data.DefaultMarsPhotosRepository
import junit.framework.TestCase
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Test


@OptIn(ExperimentalCoroutinesApi::class)
class NetworkMarsPhotosRepositoryTest() {
    @Test
    fun networkMarsPhotosRepository_getMarsPhotos_verifyPhotoList() =
        runTest {
            val repository = DefaultMarsPhotosRepository(
                marsApiService = FakeMarsApiService()
            )
            TestCase.assertEquals(FakeDataSource.photosList, repository.getMarsPhotos())
        }
}

