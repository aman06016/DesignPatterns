package com.example.design.lldPatterns.facadePattern;

public class FacadePatternDemo {
    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        Amplifier amplifier = new Amplifier();
        TheaterLights lights = new TheaterLights();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, amplifier, lights);
        
        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}
