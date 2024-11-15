package com.example.design.designPatterns.observerPattern;

public class CurrentConditionsDisplay implements Observer,DisplayElement{

    private float temperature;
    private float pressure;
    private float humidity;


    public CurrentConditionsDisplay(Subject subject){
        subject.addObserver(this);
    }
    @Override
    public void display() {
        System.out.println("current conditions : " + temperature + " degrees ,  pressure " + pressure + " too much" );
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.pressure= pressure;
        this.humidity = humidity;
        display();
    }
}
