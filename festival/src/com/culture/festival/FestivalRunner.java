package com.culture.festival;

import com.culture.festival.festival.Festival;

public class FestivalRunner {
    public static void main(String[] args) {
        Festival festival1 = new Festival();
        festival1.setName("Diwali");
        festival1.setCountry("India");
        festival1.setSeason("Autumn");
        festival1.setDurationDays(5);
        festival1.setIsPublicHoliday(true);
        festival1.setMainActivity("Lighting lamps");
        festival1.setOriginYear("Ancient");

        Festival festival2 = new Festival();
        festival2.setName("Christmas");
        festival2.setCountry("Worldwide");
        festival2.setSeason("Winter");
        festival2.setDurationDays(1);
        festival2.setIsPublicHoliday(true);
        festival2.setMainActivity("Gift exchange and prayers");
        festival2.setOriginYear("4 AD");

        Festival festival3 = new Festival();
        festival3.setName("Holi");
        festival3.setCountry("India");
        festival3.setSeason("Spring");
        festival3.setDurationDays(2);
        festival3.setIsPublicHoliday(true);
        festival3.setMainActivity("Playing with colors");
        festival3.setOriginYear("300 AD");

        Festival festival4 = new Festival();
        festival4.setName("Thanksgiving");
        festival4.setCountry("USA");
        festival4.setSeason("Autumn");
        festival4.setDurationDays(1);
        festival4.setIsPublicHoliday(true);
        festival4.setMainActivity("Feasting with family");
        festival4.setOriginYear("1621");

        Festival festival5 = new Festival();
        festival5.setName("Oktoberfest");
        festival5.setCountry("Germany");
        festival5.setSeason("Autumn");
        festival5.setDurationDays(16);
        festival5.setIsPublicHoliday(false);
        festival5.setMainActivity("Beer celebration");
        festival5.setOriginYear("1810");

        festival1.details();
        festival2.details();
        festival3.details();
        festival4.details();
        festival5.details();
    }
}