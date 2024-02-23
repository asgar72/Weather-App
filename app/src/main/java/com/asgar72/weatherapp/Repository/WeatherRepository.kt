package com.asgar72.weatherapp.Repository

import com.asgar72.weatherapp.Server.ApiServices

class WeatherRepository(val api:ApiServices) {
    fun getCurrentWeather(lat:Double,lng:Double,unit:String)=
        api.getCurrentWeather(lat,lng,unit, "35df29d379f2a6cbb2c5f3b127245ca1")
}