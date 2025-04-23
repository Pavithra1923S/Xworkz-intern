package com.xworkz.method.library;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LibraryDto {
        private int bookId;
        private String bookTitle;
        private String author;
        private String genre;
        private int publicationYear;

        @Override
        public String toString() {
            return "LibraryDto: \nbookId = " + this.bookId +
                    " ," + "\nbookTitle = " + this.bookTitle +
                    " ," + "\nauthor = " + this.author +
                    " ," + "\ngenre = " + this.genre +
                    " ," + "\npublicationYear = " + this.publicationYear;
        }
    }


