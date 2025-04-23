package com.xworkz.method.Movie;

public class MovieRunner {

    public static void main(String[] args) {
        MovieDto movieDto = new MovieDto();
        movieDto.setMovieId(1);
        movieDto.setMovieName("Darshan");
        movieDto.setDirector("Thugudeepa");
        movieDto.setReleaseYear(2010);
        movieDto.setBoxOfficeCollection(830000.0);

        System.out.println(movieDto.toString());
    }
}

