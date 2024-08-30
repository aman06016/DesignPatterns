package com.example.design.lldPatterns.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private float temperature;
    private float pressure;
    private float humidity;

    private ArrayList<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObserver(List<Observer> observers) {
        for(Observer x : observers){
            x.update(temperature,pressure,humidity);
        }
    }

    public void changeWeatherData(float temperature,float pressure, float humidity){
        this.temperature= temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyObserver(observers);
    }

}
