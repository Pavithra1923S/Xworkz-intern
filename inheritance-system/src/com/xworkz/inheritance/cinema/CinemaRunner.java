package com.xworkz.inheritance.cinema;

public class CinemaRunner {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        cinema.playMovie();
        cinema.dimLights();

        Multiplex inox = new Multiplex();
        inox.playMovie();
        inox.dimLights();
    }
}
