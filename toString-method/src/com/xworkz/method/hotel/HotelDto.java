package com.xworkz.method.hotel;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class HotelDto {
    private int hotelId;
    private String hotelName;
    private String city;
    private int starRating;
    private double roomPrice;

    @Override
    public String toString() {
        return "HotelDto: \nhotelId = " + this.hotelId +
                " ," + "\nhotelName = " + this.hotelName +
                " ," + "\ncity = " + this.city +
                " ," + "\nstarRating = " + this.starRating +
                " ," + "\nroomPrice = " + this.roomPrice;
    }
}
