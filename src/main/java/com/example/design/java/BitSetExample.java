package com.example.design.java;

import java.util.BitSet;

public class BitSetExample {
    public static void main(String[] args) {
        // Default constructor creates a BitSet with a default size.
        BitSet bitSet1 = new BitSet();
        
        // Create a BitSet with a specified initial size.
        BitSet bitSet2 = new BitSet(64);
        
        System.out.println("bitSet1: " + bitSet1);
        System.out.println("bitSet2: " + bitSet2);
    }
}

