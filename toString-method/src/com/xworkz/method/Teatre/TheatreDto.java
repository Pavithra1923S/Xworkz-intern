package com.xworkz.method.Teatre;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TheatreDto {

    private int theatreId;
    private String name;
    private String screenType;
    private int totalSeats;
    private boolean acAvailable;

    @Override
    public String toString() {
        return "TheatreDto: \ntheatreId = " + this.theatreId +
                " ," + "\nname = " + this.name +
                " ," + "\nscreenType = " + this.screenType +
                " ," + "\ntotalSeats = " + this.totalSeats +
                " ," + "\nacAvailable = " + this.acAvailable;
    }
}
