package com.xworkz.method.railway;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TrainDto {
    private int trainNo;
    private String trainName;
    private String origin;
    private String destination;
    private int totalCoaches;

    @Override
    public String toString() {
        return "TrainDto: \ntrainNo = " + this.trainNo +
                " ," + "\ntrainName = " + this.trainName +
                " ," + "\norigin = " + this.origin +
                " ," + "\ndestination = " + this.destination +
                " ," + "\ntotalCoaches = " + this.totalCoaches;
    }
}
