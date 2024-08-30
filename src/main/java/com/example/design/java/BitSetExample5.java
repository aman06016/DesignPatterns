package com.example.design.java;

import java.util.BitSet;

public class BitSetExample5 {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet();

        bitSet.set(0);
        bitSet.set(2);
        bitSet.set(4);

        // Flip a bit
        bitSet.flip(2);

        System.out.println("After flipping bit 2: " + bitSet);

        // Logical size
        System.out.println("Logical size: " + bitSet.length());

        // Number of set bits
        System.out.println("Number of set bits: " + bitSet.cardinality());
    }
}
