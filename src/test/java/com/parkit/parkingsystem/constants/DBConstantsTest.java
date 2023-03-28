package com.parkit.parkingsystem.constants;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DBConstantsTest {

	@Test
    public void checkConstantsValue() {
		String nextParkingSpot = DBConstants.GET_NEXT_PARKING_SPOT;
    	assertEquals(nextParkingSpot, "select min(PARKING_NUMBER) from parking where AVAILABLE = true and TYPE = ?");
    	assertEquals(DBConstants.GET_PARKING_SPOT_AVAILABILITY, "select AVAILABLE from parking where PARKING_NUMBER = ?");
    	assertEquals(DBConstants.GET_TICKET, "select t.PARKING_NUMBER, t.ID, t.PRICE, t.IN_TIME, t.OUT_TIME, p.TYPE from ticket t,parking p where p.parking_number = t.parking_number and t.VEHICLE_REG_NUMBER=? order by t.IN_TIME  limit 1");
    	assertEquals(DBConstants.IS_ALREADY_CLIENT, "select ID from ticket WHERE (VEHICLE_REG_NUMBER = ?) AND (OUT_TIME IS NOT NULL) limit 1");
    	assertEquals(DBConstants.SAVE_TICKET, "insert into ticket(PARKING_NUMBER, VEHICLE_REG_NUMBER, PRICE, IN_TIME, OUT_TIME) values(?,?,?,?,?)");
    	assertEquals(DBConstants.UPDATE_PARKING_SPOT, "update parking set available = ? where PARKING_NUMBER = ?");
    	assertEquals(DBConstants.UPDATE_TICKET, "update ticket set PRICE=?, OUT_TIME=? where ID=? AND OUT_TIME IS NULL");
    }

}
