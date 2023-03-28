package com.parkit.parkingsystem.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.parkit.parkingsystem.constants.ParkingType;

public class ParkingSpotTest {

	@Test
    public void checkSetters() {
    	ParkingSpot parkingSpot = new ParkingSpot(1, ParkingType.BIKE, true);
    	parkingSpot.setId(2);
    	parkingSpot.setAvailable(false);
    	parkingSpot.setParkingType(ParkingType.CAR);
    	
    	assertEquals(2, parkingSpot.getId());
    	assertEquals(false, parkingSpot.isAvailable());
    	assertEquals(ParkingType.CAR, parkingSpot.getParkingType());
    }

}
