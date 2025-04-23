package com.xworkz.method.airport;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AirportDto {

    private int airportId;
    private String airportName;
    private String city;
    private int terminals;
    private boolean international;

    @Override
    public String toString() {
        return "AirportDto: \nairportId = " + this.airportId +
                " ," + "\nairportName = " + this.airportName +
                " ," + "\ncity = " + this.city +
                " ," + "\nterminals = " + this.terminals +
                " ," + "\ninternational = " + this.international;
    }
}
