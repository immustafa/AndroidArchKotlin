package com.imgego.androidarchkotlin.network

import android.content.Context
import com.imgego.androidarchkotlin.BuildConfig
import dagger.hilt.android.qualifiers.ApplicationContext
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Inject


class ApiClient @Inject constructor(@ApplicationContext context: Context) {

    companion object {
        /*private const val API_BASE_URL = "https://api.artic.edu/api/v1/"*/
        private const val READ_TIMEOUT = 5L
        private const val CONNECTION_TIMEOUT = 2L
    }

    fun <Api> buildApi(
        api: Class<Api>
    ): Api {
        return Retrofit.Builder()
            .baseUrl(BuildConfig.API_BASE_URL)
            .client(getRetrofitClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(api)
    }

    private fun getRetrofitClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .readTimeout(READ_TIMEOUT, TimeUnit.SECONDS)
            .connectTimeout(CONNECTION_TIMEOUT, TimeUnit.SECONDS)
            .also { client ->
                if (BuildConfig.DEBUG) {
                    client.addInterceptor(
                        HttpLoggingInterceptor()
                            .apply {
                                level = HttpLoggingInterceptor.Level.BODY
                            })
                }
            }.build()
    }
}


