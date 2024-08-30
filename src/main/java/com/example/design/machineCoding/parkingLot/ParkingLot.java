package com.example.design.machineCoding.parkingLot;

import java.util.ArrayList;
import java.util.List;

class ParkingLot {
    private List<ParkingLevel> levels;

    public ParkingLot(int numberOfLevels, int slotsPerLevel) {
        levels = new ArrayList<>();
        for (int i = 0; i < numberOfLevels; i++) {
            levels.add(new ParkingLevel(i, slotsPerLevel));
        }
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (ParkingLevel level : levels) {
            if (level.parkVehicle(vehicle)) {
                return true;
            }
        }
        return false;
    }

    public boolean unParkVehicle(String vehicleId) {
        for (ParkingLevel level : levels) {
            if (level.unParkVehicle(vehicleId)) {
                return true;
            }
        }
        return false;
    }

    public int getAvailableSlots(int levelNumber) {
        return levels.get(levelNumber).getAvailableSlots();
    }

    public List<String> getOccupiedSlots(int levelNumber) {
        return levels.get(levelNumber).getOccupiedSlots();
    }
}

class ParkingLevel {
    private int levelId;
    private ParkingSlot[] slots;

    public ParkingLevel(int levelId, int numberOfSlots) {
        this.levelId = levelId;
        slots = new ParkingSlot[numberOfSlots];
        for (int i = 0; i < numberOfSlots; i++) {
            slots[i] = new ParkingSlot(i);
        }
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (ParkingSlot slot : slots) {
            if (slot.isAvailable() && slot.canFitVehicle(vehicle)) {
                slot.park(vehicle);
                return true;
            }
        }
        return false;
    }

    public boolean unParkVehicle(String vehicleId) {
        for (ParkingSlot slot : slots) {
            if (slot.isOccupiedBy(vehicleId)) {
                slot.unPark();
                return true;
            }
        }
        return false;
    }

    public int getAvailableSlots() {
        int available = 0;
        for (ParkingSlot slot : slots) {
            if (slot.isAvailable()) {
                available++;
            }
        }
        return available;
    }

    public List<String> getOccupiedSlots() {
        List<String> occupiedSlots = new ArrayList<>();
        for (ParkingSlot slot : slots) {
            if (!slot.isAvailable()) {
                occupiedSlots.add("Slot ID: " + slot.getSlotId() + " Vehicle ID: " + slot.getVehicle().getId());
            }
        }
        return occupiedSlots;
    }
}

class ParkingSlot {
    private int slotId;
    private Vehicle currentVehicle;

    public ParkingSlot(int slotId) {
        this.slotId = slotId;
        this.currentVehicle = null;
    }

    public boolean isAvailable() {
        return currentVehicle == null;
    }

    public boolean canFitVehicle(Vehicle vehicle) {
        return vehicle.canFitInSlot(this);
    }

    public void park(Vehicle vehicle) {
        this.currentVehicle = vehicle;
    }

    public void unPark() {
        this.currentVehicle = null;
    }

    public boolean isOccupiedBy(String vehicleId) {
        return currentVehicle != null && currentVehicle.getId().equals(vehicleId);
    }

    public int getSlotId() {
        return slotId;
    }

    public Vehicle getVehicle() {
        return currentVehicle;
    }
}

abstract class Vehicle {
    protected String id;

    public Vehicle(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public abstract boolean canFitInSlot(ParkingSlot slot);
}

class Car extends Vehicle {
    public Car(String id) {
        super(id);
    }

    @Override
    public boolean canFitInSlot(ParkingSlot slot) {
        return true; // Cars can fit in regular slots
    }
}

class Bike extends Vehicle {
    public Bike(String id) {
        super(id);
    }

    @Override
    public boolean canFitInSlot(ParkingSlot slot) {
        return true; // Bikes can fit in regular slots
    }
}

class Truck extends Vehicle {
    public Truck(String id) {
        super(id);
    }

    @Override
    public boolean canFitInSlot(ParkingSlot slot) {
        return slot.getSlotId() % 2 == 0; // Example: trucks can only fit in larger, even-numbered slots
    }
}
