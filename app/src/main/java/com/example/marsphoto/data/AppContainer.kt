package com.example.marsphoto.data

import com.example.marsphoto.network.MarsApiService
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

interface AppContainer {
    val marsPhotosRepository: MarsPhotosRepository
}

class DefaultAppContainer: AppContainer {

    private val BASE_URL =
        "https://android-kotlin-fun-mars-server.appspot.com"


    /**
     * Build the Moshi object that Retrofit will be using, making sure to add the Kotlin adapter for
     * full Kotlin compatibility.
     */
    private val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

    /**
     * Use the Retrofit builder to build a retrofit object using a Moshi converter with our Moshi
     * object.
     */
    private val retrofit = Retrofit.Builder()
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .baseUrl(BASE_URL)
        .build()

    private val retrofitService : MarsApiService by lazy {
        retrofit.create(MarsApiService::class.java)
    }

    override val marsPhotosRepository: MarsPhotosRepository by lazy {
        DefaultMarsPhotosRepository(retrofitService)
    }
}