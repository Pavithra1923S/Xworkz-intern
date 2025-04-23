package com.xworkz.method.uber;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UberDto {
     private int id;
    private String pickupPalce;
    private String destination;
    private int price;
    private int ratings;


public String toString(){
    return "UberDto details :- \nid :"+id +
            "\npickup palce :" + pickupPalce+
            "\ndestination :" + destination+
            "\nprice :" + price+
            "\nratings :" + ratings;
}}
