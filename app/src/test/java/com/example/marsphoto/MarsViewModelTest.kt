package com.example.marsphoto


import kotlinx.coroutines.ExperimentalCoroutinesApi


@OptIn(ExperimentalCoroutinesApi::class)
class marsViewModelTest {

    /*
    @get:Rule
    val testDispatcher = TestDispatcherRule()

    @Test
    fun marsViewModel_getMarsPhotos_verifyMarsUiStateSuccess() =
        runTest {
            val marsViewModel = MarsViewModel(
                marsPhotosRepository = DefaultFakeMarsPhotosRepository()
            )
            assertEquals(
                MarsUiState.Success(
                    "Success. ${FakeDataSource.photosList.size} Mars " +
                            "photos retrieved"
                ),
                marsViewModel.marsUiState
            )
        }

     */
}
