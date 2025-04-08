package com.xworkz.graniteapp;

import com.xworkz.graniteapp.granite.Granite;

public class GraniteRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        Granite granite1 = new Granite();
        granite1.setGraniteCode(101);
        granite1.setGraniteBrand("Classic Stones");
        granite1.setGraniteType("Countertops");
        granite1.setColor("Black Galaxy");
        granite1.setPrice(4500.50);
        granite1.setGraniteGrade("A");
        granite1.setSize(20);

        int gCode1 = granite1.getGraniteCode();
        String gBrand1 = granite1.getGraniteBrand();
        String gType1 = granite1.getGraniteType();
        String gColor1 = granite1.getColor();
        double gPrice1 = granite1.getPrice();
        String gGrade1 = granite1.getGraniteGrade();
        int gSize1 = granite1.getSize();

        System.out.println("Granite Code: " + gCode1);
        System.out.println("Granite Brand: " + gBrand1);
        System.out.println("Granite Type: " + gType1);
        System.out.println("Granite Color: " + gColor1);
        System.out.println("Granite Price: Rs." + gPrice1);
        System.out.println("Granite Grade: " + gGrade1);
        System.out.println("Granite Size: " + gSize1 + " sq ft");
        System.out.println(" ");

        Granite granite2 = new Granite();
        granite2.setGraniteCode(102);
        granite2.setGraniteBrand("Premium Rocks");
        granite2.setGraniteType("Flooring");
        granite2.setColor("White Marble");
        granite2.setPrice(5500.75);
        granite2.setGraniteGrade("B");
        granite2.setSize(25);

        int gCode2 = granite2.getGraniteCode();
        String gBrand2 = granite2.getGraniteBrand();
        String gType2 = granite2.getGraniteType();
        String gColor2 = granite2.getColor();
        double gPrice2 = granite2.getPrice();
        String gGrade2 = granite2.getGraniteGrade();
        int gSize2 = granite2.getSize();

        System.out.println("Granite Code: " + gCode2);
        System.out.println("Granite Brand: " + gBrand2);
        System.out.println("Granite Type: " + gType2);
        System.out.println("Granite Color: " + gColor2);
        System.out.println("Granite Price: Rs." + gPrice2);
        System.out.println("Granite Grade: " + gGrade2);
        System.out.println("Granite Size: " + gSize2 + " sq ft");
        System.out.println(" ");

        Granite granite3 = new Granite();
        granite3.setGraniteCode(103);
        granite3.setGraniteBrand("Luxury Granites");
        granite3.setGraniteType("Wall Cladding");
        granite3.setColor("Red Jasper");
        granite3.setPrice(6000.00);
        granite3.setGraniteGrade("A");
        granite3.setSize(30);

        int gCode3 = granite3.getGraniteCode();
        String gBrand3 = granite3.getGraniteBrand();
        String gType3 = granite3.getGraniteType();
        String gColor3 = granite3.getColor();
        double gPrice3 = granite3.getPrice();
        String gGrade3 = granite3.getGraniteGrade();
        int gSize3 = granite3.getSize();

        System.out.println("Granite Code: " + gCode3);
        System.out.println("Granite Brand: " + gBrand3);
        System.out.println("Granite Type: " + gType3);
        System.out.println("Granite Color: " + gColor3);
        System.out.println("Granite Price: Rs." + gPrice3);
        System.out.println("Granite Grade: " + gGrade3);
        System.out.println("Granite Size: " + gSize3 + " sq ft");
        System.out.println(" ");

        Granite granite4 = new Granite();
        granite4.setGraniteCode(104);
        granite4.setGraniteBrand("Royal Stoneworks");
        granite4.setGraniteType("Bathroom Slabs");
        granite4.setColor("Grey Mist");
        granite4.setPrice(4800.99);
        granite4.setGraniteGrade("C");
        granite4.setSize(18);

        int gCode4 = granite4.getGraniteCode();
        String gBrand4 = granite4.getGraniteBrand();
        String gType4 = granite4.getGraniteType();
        String gColor4 = granite4.getColor();
        double gPrice4 = granite4.getPrice();
        String gGrade4 = granite4.getGraniteGrade();
        int gSize4 = granite4.getSize();

        System.out.println("Granite Code: " + gCode4);
        System.out.println("Granite Brand: " + gBrand4);
        System.out.println("Granite Type: " + gType4);
        System.out.println("Granite Color: " + gColor4);
        System.out.println("Granite Price: Rs." + gPrice4);
        System.out.println("Granite Grade: " + gGrade4);
        System.out.println("Granite Size: " + gSize4 + " sq ft");
        System.out.println(" ");

        Granite granite5 = new Granite();
        granite5.setGraniteCode(105);
        granite5.setGraniteBrand("Modern Marble Co.");
        granite5.setGraniteType("Outdoor Pavers");
        granite5.setColor("Brown Earth");
        granite5.setPrice(5100.25);
        granite5.setGraniteGrade("B");
        granite5.setSize(22);

        int gCode5 = granite5.getGraniteCode();
        String gBrand5 = granite5.getGraniteBrand();
        String gType5 = granite5.getGraniteType();
        String gColor5 = granite5.getColor();
        double gPrice5 = granite5.getPrice();
        String gGrade5 = granite5.getGraniteGrade();
        int gSize5 = granite5.getSize();

        System.out.println("Granite Code: " + gCode5);
        System.out.println("Granite Brand: " + gBrand5);
        System.out.println("Granite Type: " + gType5);
        System.out.println("Granite Color: " + gColor5);
        System.out.println("Granite Price: Rs." + gPrice5);
        System.out.println("Granite Grade: " + gGrade5);
        System.out.println("Granite Size: " + gSize5 + " sq ft");
        System.out.println(" ");

        System.out.println("Main ended");
    }
}
