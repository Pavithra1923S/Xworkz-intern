package com.xworkz.method.Movie;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MovieDto {
 private int movieId;
        private String movieName;
        private String director;
        private int releaseYear;
        private double boxOfficeCollection;

        @Override
        public String toString() {
            return "MovieDto: \nmovieId = " + this.movieId +
                    " ," + "\nmovieName = " + this.movieName +
                    " ," + "\ndirector = " + this.director +
                    " ," + "\nreleaseYear = " + this.releaseYear +
                    " ," + "\nboxOfficeCollection = " + this.boxOfficeCollection;
        }
    }


