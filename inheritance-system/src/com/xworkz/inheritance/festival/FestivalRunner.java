package com.xworkz.inheritance.festival;


public class FestivalRunner {
    public static void main(String[] args) {
        Festival fest = new Festival();
        fest.decoratePlace();
        fest.invitePeople();

        Diwali diwali = new Diwali();
        diwali.decoratePlace();
        diwali.invitePeople();

        Festival festival = new Diwali();
        System.out.println(festival);

        Diwali diwali1 =(Diwali) festival;
        System.out.println(diwali1);
    }
}
