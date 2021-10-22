package com.generation.drive;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DriversManagerTest {

    private final DriversManager driversManager = new DriversManager();

    @BeforeEach
    public void setup(){
        driversManager.addPassenger( new Passenger( "Carlos", "44234", 100 ) );
        driversManager.addPassenger( new Passenger( "Elise", "533434", 100 ) );
        driversManager.addPassenger( new Passenger( "Ian", "5343433", 100 ) );
        driversManager.addPassenger( new Passenger( "Debbie", "44555521", 100 ) );
        driversManager.addPassenger( new Passenger( "Cleon", "559988", 100 ) );
        driversManager.addPassenger( new Passenger( "Santiago", "1203123", 100 ) );

        driversManager.addDriver( new Driver( "Emilio", "1234990", 10f ) );
        driversManager.addDriver( new Driver( "Pedro", "12312440", 12f ) );
        driversManager.addDriver( new Driver( "Constanza", "9824990", 11f ) );
    }

    @Test
    public void passengerAdded() {

        Passenger passenger = new Passenger("Victor Manuel", "ABC1234");
        driversManager.addPassenger(passenger);
        assertEquals(passenger, driversManager.getPassenger(passenger.getId()));

    }

    @Test
    public void driverAdded() {

        Driver driver = new Driver ("Juan", "DVR1234", 100);
        driversManager.addDriver(driver);
        assertEquals(driver, driversManager.getDriver(driver.getId()));
    }

    @Test
    public void startTripTest(){

    }

    @Test
    public void endTripTest(){

    }

    @Test
    public void nextAvailableDriverTest(){

    }

}
