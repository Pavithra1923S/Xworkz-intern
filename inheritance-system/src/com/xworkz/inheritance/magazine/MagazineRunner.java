package com.xworkz.inheritance.magazine;

public class MagazineRunner {
    public static void main(String[] args) {
        Magazine mag = new Magazine();
        mag.designCover();
        mag.publishEdition();

        FashionMagazine fashion = new FashionMagazine();
        fashion.designCover();
        fashion.publishEdition();
    }
}
