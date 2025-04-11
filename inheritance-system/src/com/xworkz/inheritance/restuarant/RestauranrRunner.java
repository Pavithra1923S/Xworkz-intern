package com.xworkz.inheritance.restuarant;


public class RestauranrRunner {
    public static void main(String[] args) {
        Restaurant rest = new Restaurant();
        rest.takeOrder();
        rest.serveFood();

        Waiter waiter = new Waiter();
        waiter.takeOrder();
        waiter.serveFood();

        Restaurant restaurant = new Waiter();
        System.out.println(restaurant);

        Waiter waiter1  =(Waiter) restaurant;
        System.out.println(waiter1);
    }

}
