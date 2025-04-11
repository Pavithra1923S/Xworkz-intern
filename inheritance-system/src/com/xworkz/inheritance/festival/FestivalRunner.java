package com.xworkz.inheritance.festival;

public class FestivalRunner {
    public static void main(String[] args) {
        Festival fest = new Festival();
        fest.decoratePlace();
        fest.invitePeople();

        Diwali diwali = new Diwali();
        diwali.decoratePlace();
        diwali.invitePeople();
    }
}
