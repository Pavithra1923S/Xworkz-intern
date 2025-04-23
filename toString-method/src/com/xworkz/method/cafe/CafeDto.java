package com.xworkz.method.cafe;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CafeDto {
    private int cafeId;
    private String cafeName;
    private String location;
    private String popularItem;
    private double rating;

    @Override
    public String toString() {
        return "CafeDto: \ncafeId = " + this.cafeId +
                " ," + "\ncafeName = " + this.cafeName +
                " ," + "\nlocation = " + this.location +
                " ," + "\npopularItem = " + this.popularItem +
                " ," + "\nrating = " + this.rating;
    }
}
