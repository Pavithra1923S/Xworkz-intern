package com.xworkz.method.Flight;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FlightDto {
        private int flightId;
        private String airline;
        private String departure;
        private String destination;
        private double price;

        @Override
        public String toString() {
            return "FlightDto: \nflightId = " + this.flightId +
                    " ," + "\nairline = " + this.airline +
                    " ," + "\ndeparture = " + this.departure +
                    " ," + "\ndestination = " + this.destination +
                    " ," + "\nprice = " + this.price;
        }
    }


