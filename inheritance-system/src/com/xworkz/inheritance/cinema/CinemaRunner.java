package com.xworkz.inheritance.cinema;

public class CinemaRunner {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        cinema.playMovie();
        cinema.dimLights();

        Multiplex inox = new Multiplex();
        inox.playMovie();
        inox.dimLights();

        Cinema cinema1 = new Multiplex();
        System.out.println(cinema1);

        Multiplex multiplex =(Multiplex) cinema1;
        System.out.println(multiplex);

    }
}
