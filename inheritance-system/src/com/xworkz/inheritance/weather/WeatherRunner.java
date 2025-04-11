package com.xworkz.inheritance.weather;

public class WeatherRunner {
    public static void main(String[] args) {
        weatherReport report = new weatherReport();
        report.recordTemperature();
        report.predictRainfall();

        CityWeather city = new CityWeather();
        city.recordTemperature();
        city.predictRainfall();

        weatherReport report1 = new CityWeather();
        System.out.println(report1);

        CityWeather cityWeather =(CityWeather) report1;
        System.out.println(cityWeather);
    }
}
