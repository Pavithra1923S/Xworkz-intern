package com.xworkz.inheritance.weather;

public class WeatherRunner {
    public static void main(String[] args) {
        weatherReport report = new weatherReport();
        report.recordTemperature();
        report.predictRainfall();

        CityWeather city = new CityWeather();
        city.recordTemperature();
        city.predictRainfall();
    }
}
