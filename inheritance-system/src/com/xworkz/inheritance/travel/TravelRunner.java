package com.xworkz.inheritance.travel;

public class TravelRunner {
    public static void main(String[] args) {
        Travel travel = new Travel();
        travel.bookTicket();
        travel.startJourney();

        InternationalTrip trip = new InternationalTrip();
        trip.bookTicket();
        trip.startJourney();
    }
}
