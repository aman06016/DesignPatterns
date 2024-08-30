package com.example.design.machineCoding.parkingLot;


import org.testng.annotations.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ParkingLotTest {

    @Test
    public void testParkingAndUnparking() {
        ParkingLot parkingLot = new ParkingLot(2, 5);

        Vehicle car = new Car("C1");
        Vehicle bike = new Bike("B1");
        Vehicle truck = new Truck("T1");

        assertTrue(parkingLot.parkVehicle(car));
        assertTrue(parkingLot.parkVehicle(bike));
        assertFalse(parkingLot.parkVehicle(truck)); // Assuming no large slots available

        assertEquals(3, parkingLot.getAvailableSlots(0)); // 3 slots left on level 0

        assertTrue(parkingLot.unParkVehicle("C1"));
        assertEquals(4, parkingLot.getAvailableSlots(0)); // Car unparked, now 4 slots left

        assertFalse(parkingLot.unParkVehicle("C1")); // Car already unparked
    }

    @Test
    public void testGetOccupiedSlots() {
        ParkingLot parkingLot = new ParkingLot(1, 3);

        Vehicle car = new Car("C1");
        Vehicle bike = new Bike("B1");

        parkingLot.parkVehicle(car);
        parkingLot.parkVehicle(bike);

        assertEquals(1, parkingLot.getAvailableSlots(0)); // 1 slot left

        List<String> occupiedSlots = parkingLot.getOccupiedSlots(0);
        assertEquals(2, occupiedSlots.size());
        assertTrue(occupiedSlots.get(0).contains("C1"));
        assertTrue(occupiedSlots.get(1).contains("B1"));
    }
}
