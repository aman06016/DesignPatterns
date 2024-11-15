package com.example.design.designPatterns.flyweightPattern;

public class FlyweightPatternDemo {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();

        Character charA1 = factory.getCharacter('a');
        Character charA2 = factory.getCharacter('a');
        Character charB = factory.getCharacter('b');

        charA1.display(12);
        charA2.display(14);
        charB.display(16);

        System.out.println("charA1 and charA2 are the same instance: " + (charA1 == charA2));
    }
}
