package com.saif.myweather.networking


import com.saif.myweather.model.ResponseBody
import retrofit2.Call
import retrofit2.http.*
interface ApiService {
    // Get current weather data
    @GET("current.json")
    fun getCurrentWeather(
        @Query("key") key: String = ApiConfig.API_KEY,
        @Query("q") city: String,
        @Query("aqi") aqi: String = "no"
    ): Call<ResponseBody>
}