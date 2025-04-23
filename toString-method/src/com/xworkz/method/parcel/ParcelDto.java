package com.xworkz.method.parcel;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ParcelDto {
    private int parcelId;
    private String senderName;
    private String receiverName;
    private String destination;
    private double weight;

    @Override
    public String toString() {
        return "ParcelDto: \nparcelId = " + this.parcelId +
                " ," + "\nsenderName = " + this.senderName +
                " ," + "\nreceiverName = " + this.receiverName +
                " ," + "\ndestination = " + this.destination +
                " ," + "\nweight = " + this.weight;
    }

}
