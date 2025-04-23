package com.xworkz.method.cinema;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CinemaDto {
    private int cinemaId;
    private String movieName;
    private String language;
    private String screenType;
    private double ticketPrice;

    @Override
    public String toString() {
        return "CinemaDto: \ncinemaId = " + this.cinemaId +
                " ," + "\nmovieName = " + this.movieName +
                " ," + "\nlanguage = " + this.language +
                " ," + "\nscreenType = " + this.screenType +
                " ," + "\nticketPrice = " + this.ticketPrice;
    }
}
