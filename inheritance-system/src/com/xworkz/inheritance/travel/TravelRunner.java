package com.xworkz.inheritance.travel;

public class TravelRunner {
    public static void main(String[] args) {
        Travel travel = new Travel();
        travel.bookTicket();
        travel.startJourney();

        InternationalTrip trip = new InternationalTrip();
        trip.bookTicket();
        trip.startJourney();

        Travel travel1 = new InternationalTrip();
        System.out.println(travel1);

        InternationalTrip trip1 =(InternationalTrip)travel1;
        System.out.println(trip1);
    }
}
