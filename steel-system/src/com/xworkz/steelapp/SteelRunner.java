package com.xworkz.steelapp;

import com.xworkz.steelapp.steel.Steel;

public class SteelRunner {
    public static void main(String args[]){
        System.out.println("main started ");

        Steel ref = new Steel();
        ref.setSteelId(1011);
        ref.setBrand("TATA Steel");
        ref.setPrice("75000");
        ref.setType("Carbon Steel");
        ref.setIsCorrosive(true);
        ref.setApplication("Construction");
        ref.setStrength("High");

        int sId = ref.getSteelId();
        String sBrand = ref.getBrand();
        String sPrice = ref.getPrice();
        String sType = ref.getType();
        boolean sCorrosive = ref.getIsCorrosive();
        String sApplication = ref.getApplication();
        String sStrength = ref.getStrength();

        System.out.println("The steel ID is : " + sId);
        System.out.println("The steel brand is : " + sBrand);
        System.out.println("The steel price is : Rs." + sPrice);
        System.out.println("The steel type is : " + sType);
        System.out.println("Is the steel corrosive? : " + sCorrosive);
        System.out.println("The steel application is : " + sApplication);
        System.out.println("The steel strength is : " + sStrength);
        System.out.println(" ");

        Steel ref1 = new Steel();
        ref1.setSteelId(811);
        ref1.setBrand("Jindal Steel");
        ref1.setPrice("85000");
        ref1.setType("Alloy Steel");
        ref1.setIsCorrosive(false);
        ref1.setApplication("Automobile");
        ref1.setStrength("Medium");

        int steelId = ref1.getSteelId();
        String steelBrand = ref1.getBrand();
        String steelPrice = ref1.getPrice();
        String steelType = ref1.getType();
        boolean steelCorrosive = ref1.getIsCorrosive();
        String steelApplication = ref1.getApplication();
        String steelStrength = ref1.getStrength();

        System.out.println("The steel ID is : " + steelId);
        System.out.println("The steel brand is : " + steelBrand);
        System.out.println("The steel price is : Rs." + steelPrice);
        System.out.println("The steel type is : " + steelType);
        System.out.println("Is the steel corrosive? : " + steelCorrosive);
        System.out.println("The steel application is : " + steelApplication);
        System.out.println("The steel strength is : " + steelStrength);
        System.out.println(" ");

        Steel ref2 = new Steel();
        ref2.setSteelId(1);
        ref2.setBrand("SAIL Steel");
        ref2.setPrice("55000");
        ref2.setType("Stainless Steel");
        ref2.setIsCorrosive(false);
        ref2.setApplication("Kitchenware");
        ref2.setStrength("High");

        int steelId1 = ref2.getSteelId();
        String steelBrand1 = ref2.getBrand();
        String steelPrice1 = ref2.getPrice();
        String steelType1 = ref2.getType();
        boolean steelCorrosive1 = ref2.getIsCorrosive();
        String steelApplication1 = ref2.getApplication();
        String steelStrength1 = ref2.getStrength();

        System.out.println("The steel ID is : " + steelId1);
        System.out.println("The steel brand is : " + steelBrand1);
        System.out.println("The steel price is : Rs." + steelPrice1);
        System.out.println("The steel type is : " + steelType1);
        System.out.println("Is the steel corrosive? : " + steelCorrosive1);
        System.out.println("The steel application is : " + steelApplication1);
        System.out.println("The steel strength is : " + steelStrength1);
        System.out.println(" ");


        Steel ref3 = new Steel();
        ref3.setSteelId(1);
        ref3.setBrand("Essar Steel");
        ref3.setPrice("105000");
        ref3.setType("Tool Steel");
        ref3.setIsCorrosive(true);
        ref3.setApplication("Machinery");
        ref3.setStrength("Very High");

        int steelId2 = ref3.getSteelId();
        String steelBrand2 = ref3.getBrand();
        String steelPrice2 = ref3.getPrice();
        String steelType2 = ref3.getType();
        boolean steelCorrosive2 = ref3.getIsCorrosive();
        String steelApplication2 = ref3.getApplication();
        String steelStrength2 = ref3.getStrength();

        System.out.println("The steel ID is : " + steelId2);
        System.out.println("The steel brand is : " + steelBrand2);
        System.out.println("The steel price is : Rs." + steelPrice2);
        System.out.println("The steel type is : " + steelType2);
        System.out.println("Is the steel corrosive? : " + steelCorrosive2);
        System.out.println("The steel application is : " + steelApplication2);
        System.out.println("The steel strength is : " + steelStrength2);
        System.out.println(" ");


        Steel ref4 = new Steel();
        ref4.setSteelId(1);
        ref4.setBrand("POSCO Steel");
        ref4.setPrice("95000");
        ref4.setType("Alloy Steel");
        ref4.setIsCorrosive(false);
        ref4.setApplication("Aerospace");
        ref4.setStrength("Ultra High");

        int steelId3 = ref4.getSteelId();
        String steelBrand3 = ref4.getBrand();
        String steelPrice3 = ref4.getPrice();
        String steelType3 = ref4.getType();
        boolean steelCorrosive3 = ref4.getIsCorrosive();
        String steelApplication3 = ref4.getApplication();
        String steelStrength3 = ref4.getStrength();

        System.out.println("The steel ID is : " + steelId3);
        System.out.println("The steel brand is : " + steelBrand3);
        System.out.println("The steel price is : Rs." + steelPrice3);
        System.out.println("The steel type is : " + steelType3);
        System.out.println("Is the steel corrosive? : " + steelCorrosive3);
        System.out.println("The steel application is : " + steelApplication3);
        System.out.println("The steel strength is : " + steelStrength3);
        System.out.println(" ");


        System.out.println("main ended");
    }
}
