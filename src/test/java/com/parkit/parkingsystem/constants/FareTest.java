package com.parkit.parkingsystem.constants;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FareTest {

	@Test
    public void checkConstantsValue() {
    	assertEquals(Fare.BIKE_RATE_PER_HOUR, 1);
    	assertEquals(Fare.CAR_RATE_PER_HOUR, 1.5);
    }

}
