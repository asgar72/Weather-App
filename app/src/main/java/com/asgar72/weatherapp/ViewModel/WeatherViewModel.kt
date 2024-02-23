package com.asgar72.weatherapp.ViewModel

import androidx.lifecycle.ViewModel
import com.asgar72.weatherapp.Repository.WeatherRepository
import com.asgar72.weatherapp.Server.ApiClient
import com.asgar72.weatherapp.Server.ApiServices
import retrofit2.create

class WeatherViewModel (val repository: WeatherRepository) : ViewModel() {

    constructor() : this(WeatherRepository(ApiClient().getClient().create(ApiServices::class.java)))

    fun loadCurrentWeather(lat: Double, lng:Double, unit: String)=
        repository.getCurrentWeather(lat, lng, unit)
}