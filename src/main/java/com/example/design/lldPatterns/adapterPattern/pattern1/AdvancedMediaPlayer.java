package com.example.design.lldPatterns.adapterPattern.pattern1;

interface AdvancedMediaPlayer {
    void playVLC(String fileName);
    void playMP4(String fileName);
}

class VLCPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMP4(String fileName) {
        // Do nothing
    }
}

class MP4Player implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String fileName) {
        // Do nothing
    }

    @Override
    public void playMP4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
