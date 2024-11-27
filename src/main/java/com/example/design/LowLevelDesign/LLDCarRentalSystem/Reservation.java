package com.example.design.LowLevelDesign.LLDCarRentalSystem;

import com.example.design.LowLevelDesign.LLDCarRentalSystem.Product.Car;
import com.example.design.LowLevelDesign.LLDCarRentalSystem.Product.Vehicle;
import com.example.design.LowLevelDesign.LLDCarRentalSystem.Product.VehicleType;

import java.util.Date;

public class Reservation {

    int reservationId;
    User user;
    Vehicle vehicle;
    Date bookingDate;
    Date dateBookedFrom;
    Date dateBookedTo;
    Long fromTimeStamp;
    Long toTimeStamp;
    Location pickUpLocation;
    Location dropLocation;
    ReservationType reservationType;
    ReservationStatus reservationStatus;
    Location location;

    public int createReserve(User user, Vehicle vehicle){

        //generate new id
        reservationId = 12232;
        this.user=user;
        this.vehicle=vehicle;
        reservationType = ReservationType.DAILY;
        reservationStatus = ReservationStatus.SCHEDULED;

        return reservationId;
    }

    // CRUD operations

}
