package com.example.observerpattern_20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val weatherStation = WeatherStation()
        weatherStation.addMan(Man(name = "Ruslan", surName = "Ibragimov"))
        weatherStation.addMan(Man(name = "Rinat", surName = "Ibragimov"))
        weatherStation.addMan(Man(name = "Alexey", surName = "Smirnov"))
        weatherStation.addMan(Man(name = "Dasha", surName = "Panchenko"))

        weatherStation.updateWeather()

    }
}