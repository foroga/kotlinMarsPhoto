package com.example.marsphoto


import com.example.marsphoto.fake.FakeDataSource
import com.example.marsphoto.fake.FakeNetworkMarsPhotosRepository
import com.example.marsphoto.rules.TestDispatcherRule
import com.example.marsphoto.ui.screens.MarsUiState
import com.example.marsphoto.ui.screens.MarsViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test


@OptIn(ExperimentalCoroutinesApi::class)
class marsViewModelTest {

    @get:Rule
    val testDispatcher = TestDispatcherRule()

    @Test
    fun marsViewModel_getMarsPhotos_verifyMarsUiStateSuccess() =
        runTest {
            val marsViewModel = MarsViewModel(
                marsPhotosRepository = FakeNetworkMarsPhotosRepository()
            )
            assertEquals(
                MarsUiState.Success(
                    "Success. ${FakeDataSource.photosList.size} Mars " +
                            "photos retrieved"
                ),
                marsViewModel.marsUiState
            )
        }
}
