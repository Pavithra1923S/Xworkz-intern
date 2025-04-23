package com.xworkz.method.cinema;

public class CinemaRunner {

    public static void main(String[] args) {
        CinemaDto cinemaDto = new CinemaDto();
        cinemaDto.setCinemaId(100);
        cinemaDto.setMovieName("Avatar 2");
        cinemaDto.setLanguage("English");
        cinemaDto.setScreenType("IMAX");
        cinemaDto.setTicketPrice(650.00);

        System.out.println(cinemaDto.toString());
    }
}
