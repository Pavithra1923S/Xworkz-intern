package com.xworkz.method.Festival;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FestivalDto {
    private int festivalId;
    private String festivalName;
    private String location;
    private String date;
    private String specialty;

    @Override
    public String toString() {
        return "FestivalDto: \nfestivalId = " + this.festivalId +
                " ," + "\nfestivalName = " + this.festivalName +
                " ," + "\nlocation = " + this.location +
                " ," + "\ndate = " + this.date +
                " ," + "\nspecialty = " + this.specialty;
    }
}
