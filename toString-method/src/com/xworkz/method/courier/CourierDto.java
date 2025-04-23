package com.xworkz.method.courier;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CourierDto {
    private int trackingId;
    private String senderName;
    private String receiverName;
    private String deliveryCity;
    private double weight;

    @Override
    public String toString() {
        return "CourierDto: \ntrackingId = " + this.trackingId +
                " ," + "\nsenderName = " + this.senderName +
                " ," + "\nreceiverName = " + this.receiverName +
                " ," + "\ndeliveryCity = " + this.deliveryCity +
                " ," + "\nweight = " + this.weight;
    }

}
