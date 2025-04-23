package com.xworkz.method.Festival;

public class FestivalRunner {
    public static void main(String[] args) {
        FestivalDto festivalDto = new FestivalDto();
        festivalDto.setFestivalId(101);
        festivalDto.setFestivalName("Diwali");
        festivalDto.setLocation("India");
        festivalDto.setDate("2025-11-01");
        festivalDto.setSpecialty("Lights and Crackers");

        System.out.println(festivalDto.toString());
    }
}
