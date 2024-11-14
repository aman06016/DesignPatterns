package com.example.design.lldPatterns.structural.adapterPattern.pattern2;

public class AdapterPatternExample {
    public static void main(String[] args) {
        // Existing two-pin plug
        TwoPinPlug twoPinPlug = new TwoPinPlug();

        // Adapter makes it compatible with three-pin socket
        ThreePinSocket adapter = new PlugAdapter(twoPinPlug);

        // Now we can connect the two-pin plug to a three-pin socket
        adapter.connectThreePin();
    }
}
