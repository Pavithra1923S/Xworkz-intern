package com.xworkz.method.gym;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GymDto {
    private int gymId;
    private String gymName;
    private String location;
    private int trainersAvailable;
    private double monthlyFee;

    @Override
    public String toString() {
        return "GymDto: \ngymId = " + this.gymId +
                " ," + "\ngymName = " + this.gymName +
                " ," + "\nlocation = " + this.location +
                " ," + "\ntrainersAvailable = " + this.trainersAvailable +
                " ," + "\nmonthlyFee = " + this.monthlyFee;
    }
}
