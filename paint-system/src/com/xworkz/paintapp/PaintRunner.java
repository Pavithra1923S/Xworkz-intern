package com.xworkz.paintapp;

import com.xworkz.paintapp.paint.Paint;

public class PaintRunner {
    public static void main(String args[]){
        System.out.println("main started ");
    Paint ref = new Paint();
    ref.setPaintId(1011);
    ref.setBrand("Nippon");
    ref.setPrice(7500);
    ref.setManfDate("1/02/2024");
    ref.setExpdate("30/12/2030");
    ref.setColor("White");
    ref.setPaintType("Exterior Emulsion");

    int pId = ref.getPaintId();
    String pBrand = ref.getBrand();
    int pPrice = ref.getPrice();
    String pMD = ref.getManfDate();
    String pED = ref.getExpdate();
    String pColor = ref.getColor();
    String pType = ref.getPaintType();

        System.out.println("The paintId is : " + pId);
        System.out.println("The paint brand is : " + pBrand);
        System.out.println("The paint Price is : Rs." + pPrice);
        System.out.println("The paint Color is : " + pColor);
        System.out.println("The paint Type  is : " + pType);
        System.out.println("The paint Manufactured date  is : " + pMD);
        System.out.println("The paint Expiry date  is :" + pED );

        Paint ref1 = new Paint();
        ref1.setPaintId(811);
        ref1.setBrand("Asian");
        ref1.setPrice(8500);
        ref1.setManfDate("7/06/2020");
        ref1.setExpdate("30/12/2025");
        ref1.setColor("Orange");
        ref1.setPaintType("Interior Emulsion");

        int paintId = ref1.getPaintId();
        String paintBrand = ref1.getBrand();
        int paintPrice = ref1.getPrice();
        String paintMD = ref1.getManfDate();
        String paintED = ref1.getExpdate();
        String paintColor = ref1.getColor();
        String paintType = ref1.getPaintType();

    System.out.println("The paintId is : " + paintId);
    System.out.println("The paint brand is : " + paintBrand);
    System.out.println("The paint Price is : Rs." + paintPrice);
    System.out.println("The paint Color is : " + paintColor);
    System.out.println("The paint Type  is : " + paintType);
    System.out.println("The paint Manufactured date  is : " + paintMD);
    System.out.println("The paint Expiry date  is :" + paintED );

        Paint ref2 = new Paint();
        ref2.setPaintId(1);
        ref2.setBrand("G K paints");
        ref2.setPrice(5500);
        ref2.setManfDate("10/10/2023");
        ref2.setExpdate("30/12/2025");
        ref2.setColor("white");
        ref2.setPaintType("wall putty");

        int paintId1 = ref2.getPaintId();
        String paintBrand1 = ref2.getBrand();
        int paintPrice1 = ref2.getPrice();
        String paintMD1 = ref2.getManfDate();
        String paintED1 = ref2.getExpdate();
        String paintColor1 = ref2.getColor();
        String paintType1 = ref2.getPaintType();

        System.out.println("The paintId is : " + paintId1);
        System.out.println("The paint brand is : " + paintBrand1);
        System.out.println("The paint Price is : Rs." + paintPrice1);
        System.out.println("The paint Color is : " + paintColor1);
        System.out.println("The paint Type  is : " + paintType1);
        System.out.println("The paint Manufactured date  is : " + paintMD1);
        System.out.println("The paint Expiry date  is :" + paintED1 );

        Paint ref3 = new Paint();
        ref3.setPaintId(1);
        ref3.setBrand("Asian");
        ref3.setPrice(10500);
        ref3.setManfDate("10/10/2023");
        ref3.setExpdate("30/12/2025");
        ref3.setColor("gold");
        ref3.setPaintType("Royale");

        int paintId2 = ref3.getPaintId();
        String paintBrand2 = ref3.getBrand();
        int paintPrice2 = ref3.getPrice();
        String paintMD2 = ref3.getManfDate();
        String paintED2 = ref3.getExpdate();
        String paintColor2 = ref3.getColor();
        String paintType2 = ref3.getPaintType();

        System.out.println("The paintId is : " + paintId2);
        System.out.println("The paint brand is : " + paintBrand2);
        System.out.println("The paint Price is : Rs." + paintPrice2);
        System.out.println("The paint Color is : " + paintColor2);
        System.out.println("The paint Type  is : " + paintType2);
        System.out.println("The paint Manufactured date  is : " + paintMD2);
        System.out.println("The paint Expiry date  is :" + paintED2 );

        Paint ref4 = new Paint();
        ref4.setPaintId(1);
        ref4.setBrand("Dulex");
        ref4.setPrice(9500);
        ref4.setManfDate("10/10/2019");
        ref4.setExpdate("30/12/2027");
        ref4.setColor("blue");
        ref4.setPaintType("welvet touch");

        int paintId3 = ref4.getPaintId();
        String paintBrand3 = ref4.getBrand();
        int paintPrice3 = ref4.getPrice();
        String paintMD3 = ref4.getManfDate();
        String paintED3 = ref4.getExpdate();
        String paintColor3 = ref4.getColor();
        String paintType3 = ref4.getPaintType();

        System.out.println("The paintId is : " + paintId3);
        System.out.println("The paint brand is : " + paintBrand3);
        System.out.println("The paint Price is : Rs." + paintPrice3);
        System.out.println("The paint Color is : " + paintColor3);
        System.out.println("The paint Type  is : " + paintType3);
        System.out.println("The paint Manufactured date  is : " + paintMD3);
        System.out.println("The paint Expiry date  is :" + paintED3 );






        System.out.println("main ended");
    }
}
