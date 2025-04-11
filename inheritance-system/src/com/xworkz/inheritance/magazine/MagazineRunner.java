package com.xworkz.inheritance.magazine;

public class MagazineRunner {
    public static void main(String[] args) {
        Magazine mag = new Magazine();
        mag.designCover();
        mag.publishEdition();

        FashionMagazine fashion = new FashionMagazine();
        fashion.designCover();
        fashion.publishEdition();

        Magazine magazine = new FashionMagazine();
        System.out.println(magazine);

        FashionMagazine fashionMagazine =(FashionMagazine) magazine;
        System.out.println(fashionMagazine);
    }
}
