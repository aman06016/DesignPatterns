package com.example.design.lldPatterns.flyweightPattern;

public class ConcreteCharacter implements Character {
    private final char symbol;

    public ConcreteCharacter(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public void display(int fontSize) {
        System.out.println("Character: " + symbol + " with font size: " + fontSize);
    }
}
