package com.example.design.lldPatterns.flyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private final Map<Character, ConcreteCharacter> characterMap = new HashMap<>();

    public Character getCharacter(char symbol) {
        if (!characterMap.containsKey(symbol)) {
            characterMap.put(symbol, new ConcreteCharacter(symbol));
        }
        return characterMap.get(symbol);
    }
}
