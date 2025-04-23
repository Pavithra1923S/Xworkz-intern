package com.xworkz.method.cafe;

public class CafeRunner {
    public static void main(String[] args) {
        CafeDto cafeDto = new CafeDto();
        cafeDto.setCafeId(8);
        cafeDto.setCafeName("Amrut chai");
        cafeDto.setLocation("Peenya");
        cafeDto.setPopularItem("Filter coffee");
        cafeDto.setRating(4.7);

        System.out.println(cafeDto.toString());
    }
}
