package com.nation.defence;

import com.nation.defence.defence.Defence;

public class DefenceRunner {
    public static void main(String[] args) {
        Defence defence1 = new Defence();
        defence1.setBranch("Army");
        defence1.setRank("General");
        defence1.setSoldiers(1200000);
        defence1.setIsActive(true);
        defence1.setHeadquarter("New Delhi");
        defence1.setAnnualBudget(70.6);
        defence1.setCountry("India");

        Defence defence2 = new Defence();
        defence2.setBranch("Navy");
        defence2.setRank("Admiral");
        defence2.setSoldiers(67000);
        defence2.setIsActive(true);
        defence2.setHeadquarter("Washington D.C.");
        defence2.setAnnualBudget(50.1);
        defence2.setCountry("USA");

        Defence defence3 = new Defence();
        defence3.setBranch("Air Force");
        defence3.setRank("Air Chief Marshal");
        defence3.setSoldiers(140000);
        defence3.setIsActive(true);
        defence3.setHeadquarter("London");
        defence3.setAnnualBudget(45.3);
        defence3.setCountry("UK");

        Defence defence4 = new Defence();
        defence4.setBranch("Coast Guard");
        defence4.setRank("Commandant");
        defence4.setSoldiers(34000);
        defence4.setIsActive(true);
        defence4.setHeadquarter("Tokyo");
        defence4.setAnnualBudget(20.8);
        defence4.setCountry("Japan");

        Defence defence5 = new Defence();
        defence5.setBranch("Cyber Command");
        defence5.setRank("Lieutenant General");
        defence5.setSoldiers(10000);
        defence5.setIsActive(true);
        defence5.setHeadquarter("Tel Aviv");
        defence5.setAnnualBudget(10.2);
        defence5.setCountry("Israel");

        defence1.details();
        defence2.details();
        defence3.details();
        defence4.details();
        defence5.details();
    }
}