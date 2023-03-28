package com.parkit.parkingsystem.service;

import java.util.concurrent.TimeUnit;

import com.parkit.parkingsystem.constants.Fare;
import com.parkit.parkingsystem.model.Ticket;

public class FareCalculatorService {

    public void calculateFare(Ticket ticket){
        if( (ticket.getOutTime() == null) || (ticket.getOutTime().before(ticket.getInTime())) ){
            throw new IllegalArgumentException("Out time provided is incorrect:"+ticket.getOutTime().toString());
        }
        
        double fare;
        double discount = ticket.isClient() ? 0.95 : 1;
        long duraMin = TimeUnit.MILLISECONDS
                .toMinutes(ticket.getOutTime().getTime() - ticket.getInTime().getTime());

        if (duraMin  < 30){
        	ticket.setPrice(0);
        	return;
        }
        
        switch (ticket.getParkingSpot().getParkingType()){
            case CAR: {
                fare = Fare.CAR_RATE_PER_HOUR/60;
                break;
            }
            case BIKE: {
                fare = Fare.BIKE_RATE_PER_HOUR/60;
                break;
            }
            default: throw new IllegalArgumentException("Unkown Parking Type");
        }
        ticket.setPrice(duraMin * fare * discount);
        
        
    }
}