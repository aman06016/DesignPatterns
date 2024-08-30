package com.example.design.lldPatterns.facadePattern;

class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private Amplifier amplifier;
    private TheaterLights lights;

    public HomeTheaterFacade(DVDPlayer dvd, Projector proj, Amplifier amp, TheaterLights lights) {
        this.dvdPlayer = dvd;
        this.projector = proj;
        this.amplifier = amp;
        this.lights = lights;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        lights.dim(10);
        projector.on();
        projector.setInput("DVD");
        amplifier.on();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        lights.on();
        projector.off();
        amplifier.off();
        dvdPlayer.off();
    }
}
