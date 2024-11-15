package com.example.design.designPatterns.observerPattern;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        Observer currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.changeWeatherData(2.2f,3.4f,5.6f);
    }
}
