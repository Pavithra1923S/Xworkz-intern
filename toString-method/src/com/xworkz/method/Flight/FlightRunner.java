package com.xworkz.method.Flight;

public class FlightRunner {
   public static void main(String[] args) {
            FlightDto flightDto = new FlightDto();
            flightDto.setFlightId(202);
            flightDto.setAirline("Emirates");
            flightDto.setDeparture("Dubai");
            flightDto.setDestination("London");
            flightDto.setPrice(1500.50);

            System.out.println(flightDto.toString());
        }
    }


