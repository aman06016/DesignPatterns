package com.example.design.lldPatterns.observerPattern;

public class ForcastDisplay implements Observer,DisplayElement{
    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void display() {
        System.out.println("forcast conditions : " + temperature + " degrees ,  pressure " + pressure + " too much" );
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.pressure= pressure;
        this.humidity = humidity;
        display();
    }
}
