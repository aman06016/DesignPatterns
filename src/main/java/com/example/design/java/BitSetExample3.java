package com.example.design.java;

import java.util.BitSet;

public class BitSetExample3 {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet();

        bitSet.set(0);
        bitSet.set(1);

        System.out.println("Bit 0: " + bitSet.get(0)); // true
        System.out.println("Bit 1: " + bitSet.get(1)); // true
        System.out.println("Bit 2: " + bitSet.get(2)); // false
    }
}

