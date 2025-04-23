package com.xworkz.method.parcel;

public class ParcelRunner {

    public static void main(String[] args) {
        ParcelDto parcelDto = new ParcelDto();
        parcelDto.setParcelId(77);
        parcelDto.setSenderName("Amazon");
        parcelDto.setReceiverName("Pavithra");
        parcelDto.setDestination("Bangalore");
        parcelDto.setWeight(2.5);

        System.out.println(parcelDto.toString());
    }

}
