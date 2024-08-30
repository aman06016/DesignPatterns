package com.example.design.java;

import java.util.BitSet;

public class BitSetExample6 {
    public static void main(String[] args) {
        BitSet attendance = new BitSet(10);

        // Marking attendance for students 0, 2, 4
        attendance.set(0);
        attendance.set(2);
        attendance.set(4);

        System.out.println("Attendance: " + attendance);

        // Checking attendance
        for (int i = 0; i < 10; i++) {
            System.out.println("Student " + i + " present: " + attendance.get(i));
        }

        // Total number of students present
        System.out.println("Total students present: " + attendance.cardinality());
    }
}
