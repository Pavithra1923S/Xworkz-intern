package com.xworkz.inheritance.restuarant;

public class RestauranrRunner {
    public static void main(String[] args) {
        Restaurant rest = new Restaurant();
        rest.takeOrder();
        rest.serveFood();

        Waiter waiter = new Waiter();
        waiter.takeOrder();
        waiter.serveFood();
    }

}
