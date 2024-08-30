package com.example.design.lldPatterns.facadePattern;

class DVDPlayer {
    public void on() {
        System.out.println("DVD Player is ON");
    }
    public void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }
    public void off() {
        System.out.println("DVD Player is OFF");
    }
}

class Projector {
    public void on() {
        System.out.println("Projector is ON");
    }
    public void setInput(String input) {
        System.out.println("Projector input set to " + input);
    }
    public void off() {
        System.out.println("Projector is OFF");
    }
}

class Amplifier {
    public void on() {
        System.out.println("Amplifier is ON");
    }
    public void setVolume(int level) {
        System.out.println("Setting volume to " + level);
    }
    public void off() {
        System.out.println("Amplifier is OFF");
    }
}

class TheaterLights {
    public void dim(int level) {
        System.out.println("Lights dimming to " + level + "%");
    }
    public void on() {
        System.out.println("Lights are ON");
    }
}
