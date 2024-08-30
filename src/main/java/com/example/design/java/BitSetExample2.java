package com.example.design.java;

import java.util.BitSet;

public class BitSetExample2 {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet();

        // Set bits at specific positions
        bitSet.set(0);
        bitSet.set(2);
        bitSet.set(4);

        System.out.println("After setting bits: " + bitSet);

        // Clear a specific bit
        bitSet.clear(2);

        System.out.println("After clearing bit 2: " + bitSet);

        // Clear all bits
        bitSet.clear();

        System.out.println("After clearing all bits: " + bitSet);
    }
}

