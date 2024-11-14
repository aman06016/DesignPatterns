package com.example.design.lldPatterns.structural.adapterPattern.pattern2;

class PlugAdapter implements ThreePinSocket {
    private TwoPinPlug twoPinPlug;

    public PlugAdapter(TwoPinPlug twoPinPlug) {
        this.twoPinPlug = twoPinPlug;
    }

    @Override
    public void connectThreePin() {
        // Adapt the TwoPinPlug to connect to a ThreePinSocket
        twoPinPlug.connectTwoPin();
        System.out.println("Adapted to three-pin socket.");
    }
}
