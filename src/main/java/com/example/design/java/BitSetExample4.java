package com.example.design.java;

import java.util.BitSet;

public class BitSetExample4 {
    public static void main(String[] args) {
        BitSet bitSet1 = new BitSet();
        BitSet bitSet2 = new BitSet();

        bitSet1.set(0);
        bitSet1.set(1);
        bitSet1.set(2);
        System.out.println("After setting bits bitSet1: " + bitSet1);
        bitSet2.set(1);
        bitSet2.set(2);
        bitSet2.set(3);
        System.out.println("After setting bits bitSet2: " + bitSet2);
        // AND operation
        BitSet andSet = (BitSet) bitSet1.clone();
        andSet.and(bitSet2);
        System.out.println("AND: " + andSet);

        // OR operation
        BitSet orSet = (BitSet) bitSet1.clone();
        orSet.or(bitSet2);
        System.out.println("OR: " + orSet);

        // XOR operation
        BitSet xorSet = (BitSet) bitSet1.clone();
        xorSet.xor(bitSet2);
        System.out.println("XOR: " + xorSet);

        // ANDNOT operation
        BitSet andNotSet = (BitSet) bitSet1.clone();
        andNotSet.andNot(bitSet2);
        System.out.println("ANDNOT: " + andNotSet);
    }

    public class BitSetExample {
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

}

