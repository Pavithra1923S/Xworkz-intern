package com.xworkz.method.airport;

public class AirportRunner {
    public static void main(String[] args) {
        AirportDto dto = new AirportDto();
        dto.setAirportId(101);
        dto.setAirportName("Kempegowda International Airport");
        dto.setCity("Bangalore");
        dto.setTerminals(2);
        dto.setInternational(true);

        System.out.println(dto.toString());
    }
}
