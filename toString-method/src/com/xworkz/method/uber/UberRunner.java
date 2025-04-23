package com.xworkz.method.uber;

public class UberRunner {
    public static void main(String[] args) {
        UberDto uberDto = new UberDto();
        uberDto.setId(1976);
        uberDto.setPickupPalce("peenya");
        uberDto.setDestination("rajajinagar");
        uberDto.setPrice(450);
        uberDto.setRatings(4);


        System.out.println(uberDto.toString());
    }


}
