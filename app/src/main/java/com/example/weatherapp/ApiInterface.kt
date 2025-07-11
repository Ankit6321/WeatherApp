package com.example.weatherapp

import androidx.core.text.util.LocalePreferences.TemperatureUnit.TemperatureUnits
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    @GET("weather")
    fun getweatherdata(
        @Query("q") city : String,
        @Query("appid") appid :String,
        @Query("units") units: String
    ) : Call<WeatherApp>
}